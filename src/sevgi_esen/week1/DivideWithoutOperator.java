package sevgi_esen.week1;

public class DivideWithoutOperator {
    public static void main(String[] args) {
        divideWithoutDivisionOperatorMethod(20, 2);
    }

    public static void divideWithoutDivisionOperatorMethod(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Invalid Number");
        }

        System.out.print(num1 + " divide by " + num2 + " is: ");
        int count = 0;
        while (num1 >= num2) {   ///0   3
            num1 -= num2;    // 0
            count++;   // 3
        }
        System.out.println(count + " and remainder is " + num1);
    }
}



/*
Write a method that can divide two numbers without using division operator


 */