package com.sarac.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
public class Cinema extends BasedEntity {

    private String name;
    private String sponsoredName;
    @ManyToOne(fetch = FetchType.LAZY)
    private Location location;
}
