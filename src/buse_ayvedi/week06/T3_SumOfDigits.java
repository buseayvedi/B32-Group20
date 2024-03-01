package buse_ayvedi.week06;

public class T3_SumOfDigits {
    public static void main(String[] args) {

        System.out.println("sumOfDigits(\"1234\") = " + sumOfDigits1("1234"));
        System.out.println("sumOfDigits2(\"1234\") = " + sumOfDigits2("1234"));

    }
    public static Integer sumOfDigits1(String str){
        int sumOfDigits = 0;

        for (String each : str.split("")){
            int eachNumber = Integer.parseInt(each);
            sumOfDigits += eachNumber;
        }
        return sumOfDigits;
    }

    public static Integer sumOfDigits2(String str){
        Integer sumOfDigits = 0;

        for (String each : str.split("")){
            Integer eachNumber = Integer.valueOf(each);
            sumOfDigits += eachNumber;
        }
        return sumOfDigits;
    }


}
/*
String -- sum of digits in a string
Write a method that can return the sum of the digits in a string
 */