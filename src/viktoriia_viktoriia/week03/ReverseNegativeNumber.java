package viktoriia_viktoriia.week03;

public class ReverseNegativeNumber {
/*
2. Numbers -- Reverse negative number:
Write a return method that can reverse negative number and return it as int
*/

    public static void main(String[] args) {

        System.out.println(reverseNegativeNum(-15));
        System.out.println(reverseNegativeNum(-250));

    }

    public static int reverseNegativeNum(int n) {
        return n * -1;
    }
}

