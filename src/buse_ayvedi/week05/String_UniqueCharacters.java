package buse_ayvedi.week05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class String_UniqueCharacters {

    public static void main(String[] args) {

        System.out.println(uniqueCharacters("AAABBBCCCDEF"));
        System.out.println(uniqueCharacters2("AAABBBCCCDEF"));

    }
    public static String uniqueCharacters(String str){

        String result = "";

        String[] strArr = str.split("");
        for (String each : strArr){
            int n = 0;
            for (String each2 : strArr){
                if (each.equals(each2)){
                    n++;
                }

            }
            if (n == 1) {
                result += each;
            }
        }

        return result;

    }

    public static String uniqueCharacters2(String str){

        String result = "";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        list.removeIf(p-> Collections.frequency(list,p)!=1 );
        for (String each : list){
            result += each;
        }

        return result;

    }
}
/*
 Write a return  method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
 */