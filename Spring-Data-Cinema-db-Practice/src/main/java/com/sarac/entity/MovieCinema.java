package com.sarac.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "MovieCinema")
@Data
@NoArgsConstructor
public class MovieCinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private LocalDate date_time;
    @ManyToOne
    private Movie movie;
    @ManyToOne
    @JoinColumn(name ="CinemaId")
    private Cinema cinema;
    @OneToMany(mappedBy = "movieCinema")
    private List<Ticket> ticket;

    public MovieCinema(LocalDate date_time) {
        this.date_time = date_time;
    }
}
