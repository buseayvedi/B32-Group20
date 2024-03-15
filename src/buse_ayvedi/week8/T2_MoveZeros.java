package buse_ayvedi.week8;

import java.util.Arrays;

public class T2_MoveZeros {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeroToEnd(new int[]{1,0,2,0,3,0,4,0})));
    }

    public static int[] moveZeroToEnd(int[] arr){
        int[] arr2 = new int[arr.length];
        int j=0;

        for (int i = 0; i < arr.length ; i++){
            if (arr[i] != 0){
                arr2[j] = arr[i];
                j++;
            }
        }
        return arr2;
    }
}
/*
Array - Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0, 0]
 */