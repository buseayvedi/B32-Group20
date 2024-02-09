package viktoriia_viktoriia.week02;

public class ConsecutiveNums {

    public static void printConNum(int n) {

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print("Codility");
            }
            if (i % 3 == 0) {
                System.out.print("Test");
            }
            if (i % 5 == 0) {
                System.out.print("Coders");
            }
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                System.out.print(i);
            }

            System.out.println("");
        }

    }

    public static void main(String[] args) {

        printConNum(33);

        printConNum(52);

    }
}
