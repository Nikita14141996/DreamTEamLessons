package com.nikita.lessons.lesson1;


    class Main {

        public static void main(String[] args) {

            int[] arr = new int[]{1,2,3};

            int find = 3;
            int find2 = 100;

            BinarySearch  binSearch = new BinarySearch();

            boolean found1 = binSearch.searhc(arr, find);
            boolean found2 = binSearch.searhc(arr, find2);

            System.out.println(found1);

            System.out.println(found2);

            int[] arr2 = new int[100000000];

            int i = 1;

            for (int j = 0; j < 100000000; j++) {
                arr2[j] = i++;
            }

            long time = System.nanoTime();

            System.out.println(binSearch.searhc(arr2, 100000001));

            System.out.println("Total time: " + (System.nanoTime() - time));

            time = System.nanoTime();

            System.out.println(binSearch.dumbSearch(arr2, 100000001));

            System.out.println("Total time: " + (System.nanoTime() - time));


        }
    }

