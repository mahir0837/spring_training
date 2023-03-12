package com.sarac.loosely;

import java.math.BigDecimal;

public class BalanceManager {

    public boolean checkout(Balance balance, BigDecimal chekoutAmount){

        BigDecimal balanceAmount=balance.getAmount();

        return balanceAmount.subtract(chekoutAmount)
                .compareTo(BigDecimal.ZERO)>=0;
    }
}
