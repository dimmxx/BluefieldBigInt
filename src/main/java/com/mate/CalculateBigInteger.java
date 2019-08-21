package com.mate;

import java.math.BigInteger;

public class CalculateBigInteger implements Calculate {

    @Override
    public String multiply(String num1, String num2) {

        BigInteger bigIntegerNum1 = new BigInteger(num1);
        BigInteger bigIntegerNum2 = new BigInteger(num2);
        return String.valueOf(bigIntegerNum1.multiply(bigIntegerNum2));
    }
}
