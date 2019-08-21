package com.mate;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestApp {

    private CalculateBigInteger calculateBigInteger;
    private CalculateManual calculateManual;

    @Before
    public void setUp() throws Exception {
        calculateBigInteger = new CalculateBigInteger();
        calculateManual = new CalculateManual();
    }

    @After
    public void tearDown() throws Exception {
        calculateBigInteger = null;
        calculateManual = null;
    }

    @Test
    public void multiplyCalculateBigIntegerTest1() {
        Assert.assertEquals("152415789666209420210333789971041",
                calculateBigInteger.multiply("12345678987654321", "12345678987654321"));
    }

    @Test
    public void multiplyCalculateManualTest1() {
        Assert.assertEquals("152415789666209420210333789971041",
                calculateManual.multiply("12345678987654321", "12345678987654321"));
    }

    @Test
    public void multiplyCalculateBigIntegerTest2() {
        Assert.assertEquals("12345678987654321",
                calculateBigInteger.multiply("12345678987654321", "1"));
    }

    @Test
    public void multiplyCalculateManualTest2() {
        Assert.assertEquals("12345678987654321",
                calculateManual.multiply("12345678987654321", "1"));
    }

    @Test
    public void multiplyCalculateBigIntegerTest3() {
        Assert.assertEquals("12345678987654321",
                calculateBigInteger.multiply("1", "12345678987654321"));
    }

    @Test
    public void multiplyCalculateManualTest3() {
        Assert.assertEquals("12345678987654321",
                calculateManual.multiply("1", "12345678987654321"));
    }

    @Test
    public void multiplyCalculateBigIntegerTestZero() {
        Assert.assertEquals("0",
                calculateBigInteger.multiply("0", "12345678987654321"));
    }

    @Test
    public void multiplyCalculateManualTestZero() {
        Assert.assertEquals("0",
                calculateManual.multiply("0", "12345678987654321"));
    }

    @Test
    public void CalculateBigIntegerEqualsCalculateManual() {
        Assert.assertEquals(calculateManual.multiply("12345678987654321", "12345678987654321"),
                calculateBigInteger.multiply("12345678987654321", "12345678987654321"));
    }
}
