package manal_hamdi.week1;

public class Task1 {

    public static void main(String[] args) {

        System.out.println(add_or_even(8));
        System.out.println(add_or_even(7));
    }
    public static String add_or_even(int n){


        if(n%2 == 0){
            return "even";
        }else{
           return "odd";
        }
    }
  /*
Numbers -- odd & even
Write a method to identify whether a given number is even or odd.
EX:
identify(5) --> "Odd"
identify(6) --> "Even"
 */

}
