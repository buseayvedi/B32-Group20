package buse_ayvedi.week7;

import java.util.*;

public class T1_FindMinInArray {
    public static void main(String[] args) {

        System.out.println("findMin1(new Integer[]{1,2,3,4,5}) = " + findMin1(new Integer[]{1, 2, 3, 4, 5}));

        System.out.println("findMin2(new int[] {1,2,3,4,5}) = " + findMin2(new int[]{1, 2, 3, 4, 5}));

        System.out.println("findMin3(new Integer[]{1,2,3,4,5}) = " + findMin3(new Integer[]{1, 2, 3, 4, 5}));

    }

    public static int findMin1(Integer[] arr){

       ArrayList<Integer> sortedArr = new ArrayList<>(Arrays.asList(arr));
       Collections.sort(sortedArr);
       return sortedArr.get(0);

    }

    public static int findMin2(int[] arr){

        int min = arr[0];
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }

        return min;

    }

    public static int findMin3(Integer[] arr){

        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(arr));
        return set.first();

    }
}
/*
Question1: Array - Find Minimum
Write a method that can find the maximum number from an int Array
 */