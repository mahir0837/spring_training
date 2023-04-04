package com.sarac.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "paymentDetails")
@NoArgsConstructor
@Data
public class PaymentDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal merchantPayoutAmount;
    private BigDecimal commisionAmount;
    @Column(columnDefinition = "DATE")
    private LocalDate payoutDate;

    public PaymentDetails(BigDecimal merchantPayoutAmount, BigDecimal commisionAmount, LocalDate payoutDate) {
        this.merchantPayoutAmount = merchantPayoutAmount;
        this.commisionAmount = commisionAmount;
        this.payoutDate = payoutDate;
    }
}
