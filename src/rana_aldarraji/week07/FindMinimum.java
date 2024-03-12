package rana_aldarraji.week07;

import java.util.Scanner;

public class FindMinimum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your 5 array numbers: ");
        int[] arr = {scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt()};

        System.out.println("Your Minimum number is: "+miniNum(arr));

    }

    public static int miniNum(int[] arr) {
        int mini = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < mini) {
                mini = arr[i];
            }
        }
        return mini;
    }
}
/*
Write a method that can find the maximum number from an int array
 */