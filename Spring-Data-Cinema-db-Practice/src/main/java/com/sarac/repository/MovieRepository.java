package com.sarac.repository;

import com.sarac.entity.Movie;
import com.sarac.enums.MovieState;
import com.sarac.enums.MovieType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to read a movie with a name

    List<Movie>findAllByName(String name);

    //Write a derived query to list all movies between a range of prices

    List<Movie>findByPriceBetween(BigDecimal price1,BigDecimal price2);

    //Write a derived query to list all movies where duration exists in the specific list of duration

    List<Movie>findByDuration(Integer duration);

    //Write a derived query to list all movies with higher than a specific release date

    List<Movie>findByReleaseDateAfter(LocalDate date);

    //Write a derived query to list all movies with a specific state and type

    List<Movie>findByStateAndType(MovieState state, MovieType type);


    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query to list all movies between a range of prices

    @Query("SELECT m FROM Movie m WHERE m.price between ?1 AND ?2")
    List<Movie>retreiveRangeOfPrices(BigDecimal price1,BigDecimal price2);

    //Write a JPQL query that returns all movie names

    @Query("SELECT m.name FROM Movie m")
    List<String> retrieveAllMovieName();


    // ------------------- Native QUERIES ------------------- //

    //Write a native query that returns a movie by name

    @Query(value = "SELECT * FROM Movie m WHERE m.name=?1",nativeQuery = true)
    List<Movie> retrieveMovieByName(String name);

    //Write a native query that return the list of movies in a specific range of prices
    @Query(value = "SELECT * FROM Movie m WHERE m.price between ?1 AND ?2",nativeQuery = true)
    List<Movie> retrieveMovieRange(BigDecimal price1,BigDecimal price2);

    //Write a native query to return all movies where duration exists in the range of duration

    @Query(value = "SELECT * FROM Movie m WHERE m.duration BETWEEN ?1 AND ?2",nativeQuery = true)
    List<Movie>retreiveAllMoviesBaseOntheRangeOfDuration(Integer dur1,Integer dur2);

    //Write a native query to list the top 5 most expensive movies

    @Query(value = "SELECT * FROM Movie m ORDER BY m.price DESC " +
            "LIMIT 5",nativeQuery = true)
    List<Movie>retreive5ExpensiveMovie();


}
