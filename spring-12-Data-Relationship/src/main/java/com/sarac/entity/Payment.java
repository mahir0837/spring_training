package com.sarac.entity;

import com.sarac.enums.Status;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Data
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "DATE")
    private LocalDate createdDate;
    private BigDecimal amount;
    @Enumerated(EnumType.STRING)
    private Status status;

    public Payment(LocalDate createdDate, BigDecimal amount, Status status) {
        this.createdDate = createdDate;
        this.amount = amount;
        this.status = status;
    }
}
