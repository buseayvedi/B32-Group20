package rana_aldarraji.week04;

import java.util.Arrays;
import java.util.Scanner;

public class SameLetters {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String1: ");
        String str1 = scan.nextLine();
        System.out.println("Enter String2: ");
        String str2 = scan.nextLine();

        System.out.println(sameLetters(str1, str2));


    }

    public static boolean sameLetters(String str1, String str2) {

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort the character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted arrays
        Arrays.equals(charArray1, charArray2);

        // Check if the lengths of the strings are the same
        if (str1.length() != str2.length() || !Arrays.equals(charArray1, charArray2)) {
            return false;
        } else {
            return true;
        }
    }
}
/*
Write a return method that check if a String is build out of the same letters as another String
Ex: same("abc", "cab"); --> return true
same("abc,"abb") --> return false;
 */