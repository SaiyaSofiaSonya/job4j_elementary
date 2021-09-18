package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when10to00then1() {
        double expected = 1;
        Point a = new Point(1, 0);
        Point b = new Point(0, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when03to00then3() {
        double expected = 3;
        Point a = new Point(0, 3);
        Point b = new Point(0, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when00to04then4() {
        double expected = 4;
        Point a = new Point(0, 0);
        Point b = new Point(0, 4);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public  void  when000to001then4() {
        double expected = 1;
        Point a = new Point(0, 0,0);
        Point b = new Point(0, 0, 1);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public  void  when200to000then4() {
        double expected = 2;
        Point a = new Point(2, 0,0);
        Point b = new Point(0, 0, 0);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
}