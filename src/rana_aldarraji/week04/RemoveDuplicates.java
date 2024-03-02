package rana_aldarraji.week04;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str = scan.nextLine();

        System.out.println(removeDup(str));

    }

    public static String removeDup(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (!result.contains("" + str.charAt(i))) {

                result += str.charAt(i);
            }
        }
        return result;
    }
}
/*
Write a return method that can remove the duplicated values from String
Ex: removeDup("AAABBBCCC") --> ABC
 */