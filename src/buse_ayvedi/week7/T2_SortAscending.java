package buse_ayvedi.week7;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class T2_SortAscending {

    public static void main(String[] args) {

        System.out.println("sortAscending(new Integer[]{5,4,3,2,1}) = " + Arrays.toString(sortAscending(new int[]{5, 4, 3, 2, 1})));

    }

    public static int[] sortAscending(int[] arr){
        Integer[] arr2 = new Integer[arr.length];
        for (int i = 0; i < arr.length ; i++){
            arr2[i] = arr[i];
        }

        TreeSet<Integer> sortedSet = new TreeSet<>(Arrays.asList(arr2));
        Iterator<Integer> it = sortedSet.iterator();
        int i = 0;
        while (it.hasNext()){
            arr[i] = it.next();
            i++;
        }

        return arr;


    }



}
/*
Question2: Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */