package ru.job4j.array;

public class AlgoArray {

    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp;

        for (int j = 0; j < array.length; j++) {
        for (int i = 0; i < array.length; i++) {
            if (i != 4 && array[i] > array[i + 1]) {

                temp = array[i + 1]; /* переменная для временного хранения значение ячейки с индексом 0. */
                array[i + 1] = array[i]; /* записываем в ячейку с индексом 0 значение ячейки с индексом 3. */
                array[i] = temp; /* записываем в ячейку с индексом 3 значение временной переменной. */
            }
        }
        }

        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
