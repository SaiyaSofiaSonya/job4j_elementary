package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int expected = 120;
        int in = 5;
        int out = Factorial.calc(in);
        Assert.assertEquals(expected, out);

    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int expected = 1;
        int in = 0;
        int out = Factorial.calc(in);
        Assert.assertEquals(expected, out);
    }

}