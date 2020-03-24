package com.example.test;

import com.example.Calculator.Calculator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
//    @Test
//    public void addition_isCorrect() {
//        assertEquals(4, 2 + 2);
//    }

    @Test
    public void sum_isCorrect() {
        assertEquals(5, Calculator.sum(2, 3));
        assertEquals(-5, Calculator.sum(-3,-2));
        assertEquals(1, Calculator.sum(3,-2));
        assertEquals(-1, Calculator.sum(-3,2));
    }

    @Test
    public void procent() {
        assertEquals(350, Calculator.procent(700, 50));
    }
}