package rana_aldarraji.week01;

import java.util.Scanner;

public class FINRA {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }

}
/*
Task for This Week:
Numbers -- odd & even
Write a method to identify whether a given number is even or odd.
EX:
identify(5) --> "Odd"
identify(6) --> "Even"
 */