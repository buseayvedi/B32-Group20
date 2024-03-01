package buse_ayvedi.week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCDD"));

    }

    public static String frequencyOfChars(String str){
        String[] strArr = str.split("");
        String str2 = "";

        for (String each : strArr){
            int number = 0;
            for (String each2 : strArr){
                if (each.equals(each2)){
                    number++;
                }
            }
            str.replace(each,"");

            if (!str2.contains(each)){
                str2 += (each + number);
            }
        }
        return str2;

    }
}

/*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */