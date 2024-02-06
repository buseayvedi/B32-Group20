package rana_aldarraji.week02;

import java.util.Scanner;

public class ConsecutiveNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        String str2 = "Codility";
        String str3 = "Test";
        String str5 = "Coders";

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println(str2 + str3 + str5);
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(str3 + str5);
            } else if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(str2 + str3);
            } else if (i % 2 == 0 && i % 5 == 0) {
                System.out.println(str2 + str5);
            } else if (i % 2 == 0) {
                System.out.println(str2);
            } else if (i % 3 == 0) {
                System.out.println(str3);
            } else if (i % 5 == 0) {
                System.out.println(str5);
            } else {
                System.out.println(i);
            }
        }
    }
}
