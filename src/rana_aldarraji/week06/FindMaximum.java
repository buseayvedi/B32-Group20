package rana_aldarraji.week06;

import java.util.Scanner;

public class FindMaximum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.err.println("Please don't add comma between the numbers just a space!");
        System.out.println("Enter 6 array numbers: ");
        int[] nums = {scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt()};

        System.out.println(MaxNum(nums));
    }

    public static int MaxNum(int[] nums) {
        int max = nums[0];

        for (int each : nums) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }
}
/*
Write a method that can find the maximum number from an int array
 */