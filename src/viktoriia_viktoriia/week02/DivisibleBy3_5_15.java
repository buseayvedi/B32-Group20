package viktoriia_viktoriia.week02;

public class DivisibleBy3_5_15 {

    public static void main(String[] args) {

        String result = "";
        result+="Divisible by 15 ";

        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                result += i + " ";
            }
        }
        result+="\nDivisible by 5 ";
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                result += i + " ";
            }
        }
        result+="\nDivisible by 3 ";
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                result += i + " ";
            }
        }

        System.out.println(result);
    }
}
