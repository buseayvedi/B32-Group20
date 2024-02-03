package viktoriia_viktoriia.week01;

public class OddOrEven {

        /*
    Write a method which can identifies given is even or odd:
    EX:
    identify(5) -> "Odd"
    identify(6) -> "Even"
     */


    public static String oddOrEven(int number) {

        String result = "";

        if (number % 2 == 0) {
            result = "Even";
        } else {
            result = "Odd";
        }

        return result;
    }

}
