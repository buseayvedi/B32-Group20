package tatiana_lacusta.week6;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class T2_FindMaxInArray {

    // Write a method that can find the maximum number from an int Array
    public static void main(String[] args) {

        System.out.println("findMaxNum1(new arr[]{1,2,3,4,5}) = " + findMaxNum1(new int[]{1, 2, 3, 4, 5}));
        System.out.println("findMaxNum2(new arr[]{1,2,3,4,5}) = " + findMaxNum1(new int[]{1, 2, 3, 4, 5}));
        System.out.println("findMaxNum3(new arr[]{1,2,3,4,5}) = " + findMaxNum1(new int[]{1, 2, 3, 4, 5}));

    }
    public static int findMaxNum1(int[] arr){
        int max = arr[0];
        for (int each : arr){
            if (each>max ){
                max = each;
            }
        }
        return max;
    }

    public static Integer findMaxNum2(Integer[] arr){
        return Collections.max(Arrays.asList(arr));
    }

    public static Integer findMaxNum3(Integer[] arr){
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(arr));
        return set.last();
    }



}
