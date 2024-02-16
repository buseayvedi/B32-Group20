package rana_aldarraji.week03;
import java.util.Scanner;

public class ReverseNegativeNumber {
    public static int reverseNegative(int num) {
        if (num >= 0) {
            System.err.println("Number cannot be equal or bigger than zero!");
        }

        return num * -1;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        System.out.println(reverseNegative(num));

    }
}
/*
Write a return method that can reverse negative number and return it as int
 */