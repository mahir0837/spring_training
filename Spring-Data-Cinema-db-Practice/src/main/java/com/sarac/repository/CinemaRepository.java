package com.sarac.repository;

import com.sarac.entity.Account;
import com.sarac.entity.Cinema;
import com.sarac.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema, Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to get cinema with a specific name

    Optional findByName(String cinemaName);

    //Write a derived query to read sorted the top 3 cinemas that contains a specific sponsored name

    List<Cinema>findTop3ByOrderBySponsoredName();
    //Write a derived query to list all cinemas in a specific country

    List<Cinema>findByLocationCountry(String Country);

    //Write a derived query to list all cinemas with a specific name or sponsored name

    List<Cinema>findByNameOrSponsoredName(String name,String sponsoredName);


    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query to read the cinema name with a specific id

    @Query("SELECT c FROM Cinema c WHERE c.id=:id")
    String retreiveCinemaById(@Param("id") Long id);

    // ------------------- Native QUERIES ------------------- //

    //Write a native query to read all cinemas by location country

    @Query(value = "SELECT * FROM cinema c JOIN location l" +
            " ON c.location_id=l.id WHERE l.country= ?1",nativeQuery = true)
    List<Cinema> readAllCinemaByCountry(@Param("country") String country);

    //Write a native query to read all cinemas by name or sponsored name contains a specific pattern
    @Query(value = "select * from cinema c Where name ILIKE concat('%',?1,'%') " +
            "OR sponsored_name LIKE concat('%',?1,'%')", nativeQuery = true)
    List<Cinema> retrieveAllCinemaContainsNameSponsoredName(String pattern);

    //Write a native query to sort all cinemas by name

    @Query(value = "SELECT *FROM Cinema ORDER BY name",nativeQuery = true)
    List<Cinema>retreiveAllCinemaSortedByName();

    //Write a native query to distinct all cinemas by sponsored name
//
    @Query(value = "SELECT DISTINCT * FROM Cinema",nativeQuery = true)
    List<Cinema>retriveSpesificSponsoreName();


}
