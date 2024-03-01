package sevgi_esen.week3;

public class ReverseNegativeNumber {
    public static void main(String[] args) {
        int reversedNum = reverseNum(-12);
        System.out.println("Reversed Number = " + reversedNum);

    }

    public static int reverseNum(int  num) {
        String str = new StringBuilder(""+num).reverse().toString();
        if(num < 0) {
            str = "-"+str.substring(0, str.length()-1);
        }
        return Integer.valueOf(str);
    }

}
/*
 Write a return method that can reverse negative number and return it as int
 */
