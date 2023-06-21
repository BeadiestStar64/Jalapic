package com.github.jalapic.FourArithmeticOperations;

import java.math.BigDecimal;

public class addition {

    public String exactAddition(String a, String b) {
        BigDecimal decimal1 = new BigDecimal(a);
        BigDecimal decimal2 = new BigDecimal(b);
        BigDecimal result = decimal2.add(decimal1);
        return String.valueOf(result);
    }
}
