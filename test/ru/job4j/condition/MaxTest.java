package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int inLeft = 1;
        int inRight = 2;
        int expected = 2;
        int out = Max.max(inLeft, inRight);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMax2To1Then2() {
        int inLeft = 2;
        int inRight = 1;
        int expected = 2;
        int out = Max.max(inLeft, inRight);
        Assert.assertEquals(expected, out);
    }
}