package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class SquareTest {

    @Test
    public void whenBound3Then014() {
        int in = 3;
        int[] result  = Square.calculate(in);
        int[] expected = new int[] {0, 1, 4};
        Assert.assertArrayEquals(expected, expected);
    }

    @Test
    public void whenBound5Then014916() {
        int in = 5;
        int[] result  = Square.calculate(in);
        int[] expected = new int[] {0, 1, 4, 9, 16};
        Assert.assertArrayEquals(expected, expected);
    }
}