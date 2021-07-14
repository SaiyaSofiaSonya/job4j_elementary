package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class ChessBoardTest {

    @Test
    public void whenWayIs5() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 5;
        int y2 = 5;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenWayIs6() {
        int x1 = 6;
        int y1 = 6;
        int x2 = 0;
        int y2 = 0;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenWayIs0() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 5;
        int y2 = 6;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenx10x20y19y29WayIs0() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 9;
        int y2 = 9;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenx1negativex2negativey15y25WayIs0() {
        int x1 = -1;
        int y1 = -1;
        int x2 = 5;
        int y2 = 5;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }
}