package com.sarac.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ticketId;
    private LocalDateTime dateTime;
    private Integer seatNumber;
    private Integer rowNumber;
    @ManyToOne
    @JoinColumn(name = "movieCinemaId")
    private MovieCinema movieCinema;
    @ManyToOne
    @JoinColumn(name = "userAccountId")
    private UserAccount userAccount;
}
