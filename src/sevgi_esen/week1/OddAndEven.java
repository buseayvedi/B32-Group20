package sevgi_esen.week1;

public class OddAndEven {

    public static void main(String[] args) {
        System.out.println("Number you provided is " + identifyOddEven(5));
        System.out.println("Number you provided is " + identifyOddEven(6));
    }


    public static String identifyOddEven(int n) {
        return n % 2 == 0 ? "Even" : "Odd";
    }

}


/*
write a method which can identifies given number is even or odd

Ex:
identify(5) -> "Odd"
identify(6) -> "Even"



 */