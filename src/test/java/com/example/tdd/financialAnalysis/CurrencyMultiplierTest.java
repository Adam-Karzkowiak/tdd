package com.example.tdd.financialAnalysis;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CurrencyMultiplierTest {


    @Test
    @DisplayName("test multiplication")
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
