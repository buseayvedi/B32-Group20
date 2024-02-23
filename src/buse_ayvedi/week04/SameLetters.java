package buse_ayvedi.week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SameLetters {
    public static void main(String[] args) {

        sameLetters("abbcc", "bca");

    }

    public static void sameLetters(String str1, String str2) {

        String str1uniqueChar = "";
        String str2uniqueChar = "";

        for (String each : str1.split("")){
            if (!str1uniqueChar.contains(each)){
                str1uniqueChar += each;
            }
        }

        for (String each : str2.split("")){
            if (!str2uniqueChar.contains(each)){
                str2uniqueChar += each;
            }
        }

        String[] str1Arr = str1uniqueChar.split("");
        String[] str2Arr = str2uniqueChar.split("");

        Collections.sort(Arrays.asList(str1Arr));
        Collections.sort(Arrays.asList(str2Arr));


        if (Arrays.equals(str1Arr,str2Arr)){
            System.out.println("Two string have same characters");
        }else {
            System.out.println("Two string has different characters");
        }

    }

}
/*
String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */