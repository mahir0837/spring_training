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
public class Movie extends BasedEntity {

    private String name;
    @Column(columnDefinition = "DATE")
    private LocalDate releaseDate;
    private Integer duration;
    @Column(columnDefinition = "text")
    private String summary;
    @Enumerated(EnumType.STRING)
    private Type type;
    @Enumerated(EnumType.STRING)
    private State state;
    private BigDecimal price;
    @ManyToMany
    @JoinTable(name = "MovieGenreRel",
    joinColumns=@JoinColumn(name = "movieId"),
    inverseJoinColumns=@JoinColumn(name = "genreId"))
    private List<Genre> genre;
}
