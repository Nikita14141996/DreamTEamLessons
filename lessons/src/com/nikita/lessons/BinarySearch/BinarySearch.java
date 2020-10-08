package com.nikita.lessons.BinarySearch;

public class BinarySearch {
    public boolean search(int[] array, int find) {
        boolean result = false; //объявление переменных
        int from = 0;
        int to = array.length - 1;

        while (!result) { // цикл заполнения массива элементами от from до to
            if (from > to) {
                break; // выход из цикла
            }

            int midElement = to - (to - from) / 2; // нахождение среднего элемента
            int midValue = array[midElement];// сохранение искомого значения в переменную midValue
            if (midValue > find) {
                to = midElement - 1;

            } else if (midValue < find) {
                from = midElement + 1;

            } else {
                result = true;
            }
        }
        return false;
    }

}

