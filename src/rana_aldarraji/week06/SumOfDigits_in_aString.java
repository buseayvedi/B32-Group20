package rana_aldarraji.week06;

import java.util.Scanner;

public class SumOfDigits_in_aString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string: ");
//        String str = scan.nextLine();
        System.out.println(sumOfDigits(scan.nextLine()));
    }

    public static int sumOfDigits(String str) {
        int num = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                num += Character.getNumericValue(str.charAt(i));
            }
        }
        return num;
    }
}
/*
Write a method that can return the sum of the digits in a String
 */