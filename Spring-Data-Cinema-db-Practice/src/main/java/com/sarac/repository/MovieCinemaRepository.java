package com.sarac.repository;

import com.sarac.entity.MovieCinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface MovieCinemaRepository extends JpaRepository<MovieCinema, Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to read movie cinema with id

    List<MovieCinema>findByid(Long id);

    //Write a derived query to count all movie cinemas with a specific cinema id

    int countByCinemaId(Long Id);

    //Write a derived query to count all movie cinemas with a specific movie id

    int countByMovieId(Long Id);

    //Write a derived query to list all movie cinemas with higher than a specific date

    List<MovieCinema>findByDateTimeAfterOrderByDateTimeDesc(LocalDateTime dateTime);

    //Write a derived query to find the top 3 expensive movies

    List<MovieCinema>findTop3ByOrderByMoviePrice();

    //Write a derived query to list all movie cinemas that contain a specific movie name

    List<MovieCinema>findDistinctByMovieName(String movieName);

    //Write a derived query to list all movie cinemas in a specific location name

    List<MovieCinema>findByCinemaLocationName(String location);

    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query to list all movie cinemas with higher than a specific date

    @Query("SELECT m FROM MovieCinema m WHERE m.dateTime>?1")
    List<MovieCinema>findHigherThanDate(LocalDateTime date);
    // ------------------- Native QUERIES ------------------- //

    //Write a native query to count all movie cinemas by cinema id

    @Query(value = "SELECT COUNT(*) FROM movie_cinema WHERE cinema_id=?1",nativeQuery = true)
    List<MovieCinema>countMovieCinemaByCinemaId(Long cinemaId);

    //Write a native query that returns all movie cinemas by location name

    @Query(value = "SELECT * FROM MovieCinema m JOIN Cinema c " +
            "ON m.cinema_id=c.id JOIN Location l ON c.location_id=l.id HAVING l.name=?1",nativeQuery = true)
    List<MovieCinema>retreiveAllCinemaByLocationName(String LocationName);
}
