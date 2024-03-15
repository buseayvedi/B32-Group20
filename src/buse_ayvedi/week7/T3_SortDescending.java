package buse_ayvedi.week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class T3_SortDescending {

    public static void main(String[] args) {
        int[] arr = {10,20,7, 8, 90};
//        System.out.println(Arrays.toString(descendingOrder(arr)));
        System.out.println(Arrays.toString(descendingOrder2(arr)));

    }

    public static int[] descendingOrder(int[] arr){

        int n = arr.length;

        for (int i = 0; i < n-1 ; i++){
            for (int j = 0 ;  j < n-i-1 ; j++){
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }

        }
        return arr;

    }


    public static int[] descendingOrder2(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int each : arr){
            list.add(each);
        }

        int[] arr2 = new int[arr.length];

        for (int i = 0; i < arr.length ; i++){
            arr2[i]= findMax(list);
            list.remove((Integer) arr2[i] );

        }

        return arr2;

    }
    public static int findMax(ArrayList<Integer> list){
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++){
            if (list.get(i)>max){
                max = list.get(i);
            }
        }
        return max;

    }
}
/*
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};
 */