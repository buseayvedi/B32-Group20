package rana_aldarraji.week04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your String:");
        System.out.println(countLetters(in.next()));
    }

    public static String countLetters(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                int count = 0; // reset every iteration of the i loop

                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }
                }

                result += "" + str.charAt(i) + count;

            }
        }
        return result;
    }
}
/*
Write a return method that can find the frequency of characters
"AAABBCDD"--> A3B2C1D2
 */