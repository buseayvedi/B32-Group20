package rana_aldarraji.week05;

import java.util.Scanner;

public class String_Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String:");
        System.out.println(revers(scan.nextLine()));

    }

    public static String revers(String str) {

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }
}
/*
Write a return method that can reverse  String
Ex: Reverse("ABCD"); ==> DCBA
 */