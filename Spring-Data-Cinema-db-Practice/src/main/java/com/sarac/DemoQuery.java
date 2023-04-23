package com.sarac;

import com.sarac.enums.UserRole;
import com.sarac.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Component
public class DemoQuery implements CommandLineRunner {

    private final AccountRepository accountRepository;
    private final CinemaRepository cinemaRepository;
    private final GenreRepository genreRepository;
    private final MovieCinemaRepository movieCinemaRepository;
    private final MovieRepository movieRepository;
    private final TicketRepository ticketRepository;

    public DemoQuery(AccountRepository accountRepository, CinemaRepository cinemaRepository, GenreRepository genreRepository, MovieCinemaRepository movieCinemaRepository, MovieRepository movieRepository, TicketRepository ticketRepository) {
        this.accountRepository = accountRepository;
        this.cinemaRepository = cinemaRepository;
        this.genreRepository = genreRepository;
        this.movieCinemaRepository = movieCinemaRepository;
        this.movieRepository = movieRepository;
        this.ticketRepository = ticketRepository;
    }

    @Override
    public void run(String... args) throws Exception {

//        System.out.println("------------Accoount----------------");
//
////        System.out.println(accountRepository.findAllByCountryOrState("United States","New York"));
////
////        System.out.println(accountRepository.findAllByAgeLessThanEqual(35));
////
////        System.out.println(accountRepository.findByRole(UserRole.USER));
////
////        System.out.println(accountRepository.findAllByAgeBetween(20,30));
////
////        System.out.println(accountRepository.findByAddressStartsWith("25"));
////
////        System.out.println(accountRepository.findByOrderByAgeDesc());
//
//        System.out.println("------------Accoount-jpql----------------");
//
////        System.out.println(accountRepository.retrieveAllAccount());
////
////        System.out.println(accountRepository.retreiveAllAdminAccount());
////
////        System.out.println(accountRepository.retreiveAccountSortedAge());
//
////        System.out.println("------------Account-Native QUERIES----------------");
////
////        System.out.println(accountRepository.retreiveAgeLowerThan(30));
////
////        System.out.println(accountRepository.retrieveAllAccountsContainsNameAddressCountryStateCity("yor"));
////
//        System.out.println(accountRepository.retreiveAgeHigherThan(43));
//
//        System.out.println("------------Cinema----------------");
//
////        System.out.println(cinemaRepository.findByName("Hall 2 - EMPIRE"));
////
////        System.out.println(cinemaRepository.findTop3ByOrderBySponsoredName());
////
////        System.out.println(cinemaRepository.findByLocationCountry("United States"));
////
////        System.out.println(cinemaRepository.findByNameOrSponsoredName("Hall 2 - EMPIRE","Walt Disney"));
//
////        System.out.println("------------Cinema-jpql----------------");
//
////        System.out.println(cinemaRepository.retreiveCinemaById(15L));
//
//        System.out.println("------------Cinema-Native Queries----------------");
////
////       System.out.println(cinemaRepository.readAllCinemaByCountry("United States"));
////
////        System.out.println(cinemaRepository.retrieveAllCinemaContainsNameSponsoredName("is"));
//////
////        System.out.println(cinemaRepository.retreiveAllCinemaSortedByName());
////
////        System.out.println(cinemaRepository.retriveSpesificSponsoreName());
//
////        System.out.println("------------GENRE-jpql----------------");
////
////        System.out.println(genreRepository.retreiveallGenres());
////
////        System.out.println("------------GENRE-Native Queries----------------");
////        System.out.println(genreRepository.retreiveContainingName("Drama"));
////
////        System.out.println("------------MOVIE-CINEMA----------------");
////
//        System.out.println(movieCinemaRepository.findByid(3L));
//
//        System.out.println(movieCinemaRepository.countByCinemaId(12L));
//
//        System.out.println(movieCinemaRepository.countByMovieId(2L));
//
//        System.out.println(movieCinemaRepository.findByDateTimeAfterOrderByDateTimeDesc(LocalDateTime.of(2020,12,7,21,30,1)));
//
//        System.out.println(movieCinemaRepository.findTop3ByOrderByMoviePrice());
//
//        System.out.println(movieCinemaRepository.findDistinctByMovieName("The Gentleman"));
////
//        System.out.println(movieCinemaRepository.findByCinemaLocationName("AMC Lincoln Square 13"));
////
//        System.out.println("------------MOVIE-CINEMA jpql----------------");
//
////        System.out.println(movieCinemaRepository.findHigherThanDate(LocalDateTime.of(2020,12,7,20,5)));
////
////        System.out.println(movieCinemaRepository.countMovieCinemaByCinemaId(12L));
//
////        System.out.println(movieCinemaRepository.findByCinemaLocationName("AMC Empire 25"));
//
//        System.out.println("------------MOVIE----------------");
//
////        System.out.println(movieRepository.findAllByName("The Godfather"));
////
////        System.out.println(movieRepository.findByPriceBetween(BigDecimal.valueOf(15.00),BigDecimal.valueOf(30.00)));
////
////        System.out.println(movieRepository.findByDuration(142));
////
////        System.out.println(movieRepository.findByReleaseDateAfter(LocalDate.of(2020,11,12)));
////
////        System.out.println(movieRepository.findByStateAndType(MovieState.ACTIVE, MovieType.PREMIER));
////
////        System.out.println("------------MOVIE-JPQL----------------");
////
//        System.out.println(movieRepository.retreiveRangeOfPrices(BigDecimal.valueOf(15.00),BigDecimal.valueOf(25.00)));
//
//        System.out.println(movieRepository.retrieveAllMovieName());
//
//        System.out.println("------------MOVIE-NATIVE----------------");
//
//        System.out.println(movieRepository.retrieveMovieByName("Tenet"));
//
//        System.out.println(movieRepository.retrieveMovieRange(BigDecimal.valueOf(15.00),BigDecimal.valueOf(25.00)));
//
//        System.out.println(movieRepository.retreiveAllMoviesBaseOntheRangeOfDuration(110,120));
//
//        System.out.println(movieRepository.retreive5ExpensiveMovie());
//        System.out.println("------------Ticket----------------");

//        System.out.println(ticketRepository.countAllByUserAccount_Username("bernard"));
//
//        System.out.println(ticketRepository.findByUserAccountEmail("faith.p@email.com"));
//
//        System.out.println(ticketRepository.countByMovieCinema_Movie_Name("The Gentleman"));
//
//        System.out.println(ticketRepository.findByDateTimeBetween(LocalDateTime.of(2020,12,8,18,1),LocalDateTime.of(2020,12,8,21,1)));
//
//        System.out.println("------------TicketJPql----------------");
//
//        System.out.println(ticketRepository.retreiveTicketFromUser(2L));
//
//        System.out.println(ticketRepository.retreiveTicketBetwenRange(LocalDateTime.of(2020,12,8,18,1),LocalDateTime.of(2020,12,8,21,1)));
//
//        System.out.println(ticketRepository.countTicket());


    }
}
