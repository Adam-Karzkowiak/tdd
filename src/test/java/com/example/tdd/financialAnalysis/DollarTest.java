package com.example.tdd.financialAnalysis;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DollarTest {


    @Test
    @DisplayName("test multiplication")
    void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }

    @Test
    @DisplayName("test multiplication with side effects")
    void testMultiplWithSide(){
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10,product.amount);
        product=five.times(3);
        assertEquals(15,product.amount);
    }


}
