package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        boolean leftMoreTheRightOne = left > right;
        return leftMoreTheRightOne ? left : right;
    }
}
