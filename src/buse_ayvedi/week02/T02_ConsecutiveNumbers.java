package buse_ayvedi.week02;

public class T02_ConsecutiveNumbers {

    public static void main(String[] args) {
        consecutiveNum(20);
    }
    public static void consecutiveNum(int n){
        for (int i = 1; i <= n ; i++){
            String str = "";
            if (i % 2 == 0 ) {
                str += "Codility";
            }
            if ( i % 3 == 0){
                str += "Test";
            }
            if ( i % 5 == 0){
                str +="Coders";
            }
            if (str.isEmpty()){
                System.out.println(i);
            }else{
                System.out.println(str);
            }
        }
    }
}

/*
3.Numbers -- print consecutive numbers

Write а function:
that, given а positive integer N, prints the consecutive numbers from 1 to N, each оп а separate line.
However, апу number divisible Ьу 2, 3 or 5 should Ье replaced Ьу the word Codility, Test or Coders respectively.
lf а number is divisible bу more than оnе of the numbers: 2,3 or 5, it should bе replaced Ьу а concatenation of the respective words Codility,
Test and Coders in this given order. For example, numbers divisible Ьу both 2 and 3 should bе replace Ьу CodilityTest апd
numbers divisible bу all three numbers: 2,3 апd 5, should bе replaced bу CodilityTestCoders.

For example, here is the output for N = 24:

1
Codility
Test
Codility
Coders
CodilityTest
7
Codility
Test
CodilityCoders
11
CodilityTest
13
Codility
TestCoders
Codility
17

 */