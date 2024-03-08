package buse_ayvedi.week05;

import java.util.ArrayList;
import java.util.Arrays;

public class String_Reverse {

    public static void main(String[] args) {

        System.out.println("reverseString(\"ABCD\") = " + reverseString("ABCD"));
        System.out.println("reverseString(\"ABCD\") = " + reverseString2("ABCD"));
        System.out.println("reverseString(\"ABCD\") = " + reverseString3("ABCD"));

    }
    public static String reverseString(String str){

        String result = "";
        for (int i = str.length()-1; i>=0; i--){
            result+=str.charAt(i);
        }
        return result;
    }

    public static String reverseString2(String str){
        String result = "";
        String[] strArr = str.split("");
        for (int i = strArr.length-1; i >=0; i--){
            result += strArr[i];
        }
        return result;

    }

    public static String reverseString3(String str){
        String result = "";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        for (int i = list.size()-1 ; i >=0 ; i--){
            result += list.get(i);
        }
        return result;
    }

}
/*
Write a return method that can reverse  String
 Ex: Reverse("ABCD"); ==> DCBA
 */