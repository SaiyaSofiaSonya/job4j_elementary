package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        float[] prices = new float[40];
        System.out.println("Размер массива равен: " + ages.length);
      //  System.out.println("Размер массива равен: " + names.length);
        System.out.println("Размер массива равен: " + prices.length);
        String[] names = new String[4];
        names[0] = "Vasya";
        names[1] = "Kolya";
        names[2] = "Katya";
        names[3] = "Tanya";
    }
}
