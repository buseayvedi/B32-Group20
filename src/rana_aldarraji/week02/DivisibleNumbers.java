package rana_aldarraji.week02;

public class DivisibleNumbers {
    public static void main(String[] args) {


        System.out.print("Divisible by 15: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print("\nDivisible by 5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print("\nDivisible by 3: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
/*
DivisibleBy15
DivisibleBy3
DivisibleBy5
 */