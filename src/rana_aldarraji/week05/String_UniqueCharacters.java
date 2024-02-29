package rana_aldarraji.week05;

import java.util.Scanner;

public class String_UniqueCharacters {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String:");
        System.out.println(uniqueCharacters(scan.nextLine()));

    }

    public static String uniqueCharacters(String str) {


        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) { // --> if the character appeared from left-right(str.indexOf) equals the times the character appeared from right-left(str.lastIndexOf) then it is unique.
                unique += ch;
            }
        }
        return unique;
    }

}
/*
Write a return  method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
 */