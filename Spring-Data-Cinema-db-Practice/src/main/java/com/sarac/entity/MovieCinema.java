package com.sarac.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Table(name = "MovieCinema")
@Data
@NoArgsConstructor
public class MovieCinema extends BasedEntity{

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDate date_time;
    @ManyToOne(fetch = FetchType.LAZY)
    private Movie movie;
    @ManyToOne(fetch = FetchType.LAZY)
    private Cinema cinema;
}
