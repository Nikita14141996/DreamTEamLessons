package com.nikita.lessons.lesson1;

public class BinarySearch {
    public boolean searhc(int[] array, int find) {
        boolean result = false;
        int from = 0;
        int to = array.length - 1;
        while (!result) {
            if (from > to) {
                break;
            }
            int midElement = to - (to - from) / 2;
            int midValue = array[midElement];
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
    public boolean dumbSearch(int[] array, int find) {

        for (int a : array) {
            if (a == find) {
                return true;
            }
        }
        return false;
    }

}



