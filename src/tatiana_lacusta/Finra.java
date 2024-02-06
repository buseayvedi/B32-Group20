package tatiana_lacusta;

public class Finra {

    public static void main(String[] args) {

        int n = 11;
        boolean by3 = n % 3 == 0;
        boolean by5 = n % 5 == 0;
        String result = "";

        if(by3 && by5){
            result = "FINRA";
        } else if(by3){
            result = "FIN";
        } else if(by5){
            result = "RA";
        } else {
            result = "" + n;
        }

        System.out.println(result);
    }
}

/*
{IQ} Finra [multibranch, operators]

	Create a program that will print the given number. But if the number is a multiple of 3 print "FIN" instead of the
	 number. If the number is a multiple of 5 print "RA" instead of the number. And if the number is a multiple of 3
	 and 5 print "FINRA" instead of the number

		ex:
			number: 3
			output: FIN

			number: 10
			output: RA

			number: 15
			output: FINRA

			number: 7
			output: 7

	Hint: you will be checking for divisibility, so you will need to use the % operator



 */