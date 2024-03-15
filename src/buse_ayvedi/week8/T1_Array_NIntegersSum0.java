package buse_ayvedi.week8;

import java.util.*;

public class T1_Array_NIntegersSum0 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(arraySum0(2)));

    }

    public static int[] arraySum0(int n){

        Random random = new Random();
        int[] arr = new int[n];

        int max = 10;
        int min = 1;

        if (n ==1){
            return new int[]{0};
        }
        if (n==2){
            int a = random.nextInt(max - min) + 1;
            int b = -a;
            return new int[]{a,b};
        }

        return arr;




    }
}
/*
Array - N unique integers that sum up to 0
Write a function that given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
The function can return any such array.
For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
For N = 3 one of the possible answers is [-1,0,1] (but there are many more correct answers).

 */