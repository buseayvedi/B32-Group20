package viktoriia_viktoriia.week03;

public class PrimeNumber {
/*
1.	Numbers -- Prime Number:
Write a method that can check if a number is prime or not
*/

    public static void main(String[] args) {

        System.out.println(isPrime(1));
        System.out.println(isPrime(25));
        System.out.println(isPrime(17));
        System.out.println(isPrime(100));

    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
