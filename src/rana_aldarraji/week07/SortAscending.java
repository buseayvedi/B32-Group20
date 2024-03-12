package rana_aldarraji.week07;

import java.util.Scanner;

public class SortAscending {

    public static void main(String[] args) {

        int array[] = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        ascSort(array);

        for (int i : array) {
            System.out.print(i + " "); // started with array [0]
        }
    }

    public static void ascSort(int array[]) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
/*
Write a return method that can sort an int array in an Ascending order
without using the sort method of the Arrays class.
Ex: int[] arr= {10,9,8,7};
arr = Sort(arr); ==>(7,8,9,10);

 */