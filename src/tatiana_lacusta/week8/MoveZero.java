package tatiana_lacusta.week8;

import java.util.Arrays;

public class MoveZero {

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};

        // Two-pointer approach
        int nums = 0;

        for (int i = 0; i < arr.length; i++) { // {1, 0, 2, 0, 3, 0, 4, 0};
            if (arr[i] != 0) { // true (1 != 0)
                // If the element is non-zero, swap it with the element at nonZeroIndex
                int containerForInt = arr[i]; //  temp = 1
                arr[i] = arr[nums]; // arr[i] = 1 --> arr[nums -was-> 0 --then became--> 1]
                arr[nums] = containerForInt; // arr[nums] = 1 --> now temp = 1
                nums++; // num ++ 1
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}

/*
Array - Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array (Do
Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0,
0]
 */
