package rana_aldarraji.week03;

import java.util.Scanner;

public class ReverseNegativeNumber {
    public static int reverseNegative(int num) {

        int reversed = 0;
        //1. By Using algorithm
        while (num < 0) {
            reversed = reversed * 10 + num % 10;
            num = num / 10;
        }
        return reversed;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        System.out.println(reverseNegative(num));

    }
}
/*
Write a return method that can reverse negative number and return it as int
 */