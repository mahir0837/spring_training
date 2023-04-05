package com.sarac.entity;

import com.sarac.enums.State;
import com.sarac.enums.Type;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private BigDecimal price;
    @Enumerated(EnumType.STRING)
    private Type type;
    @Enumerated(EnumType.STRING)
    private State state;
    @Column(columnDefinition = "DATE")
    private LocalDate releaseDate;
    private Integer duration;
    private String summary;
    @ManyToMany
    @JoinTable(name = "MovieGenreRel",
    joinColumns=@JoinColumn(name = "movieId"),
    inverseJoinColumns=@JoinColumn(name = "genreId"))
    private List<Genre> genre;

    public Movie(BigDecimal price, Type type, State state, LocalDate releaseDate, Integer duration, String summary) {
        this.price = price;
        this.type = type;
        this.state = state;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.summary = summary;
    }
}
