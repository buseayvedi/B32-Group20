package buse_ayvedi;

public class Task01 {
    public static void main(String[] args) {
        System.out.println(oddOrEven(5));
        System.out.println(oddOrEven(6));
    }
    public static String oddOrEven(int n){
        if (n % 2 == 0){
            return "even";
        }else{
            return "odd";
        }
        //add space
    }

}
/*
Numbers -- odd & even
Write a method to identify whether a given number is even or odd.
EX:
identify(5) --> "Odd"
identify(6) --> "Even"
 */