package rana_aldarraji.week03;

import java.util.Scanner;

public class PrimeNumbers {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) { // the smallest prime number is 2, it's also the only even prime number
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter a number: ");
        System.out.println("isPrime: " + isPrime(scan.nextInt()));

    }

}

/*
Write a method that can check if a number is prime or not
 */