package buse_ayvedi.week02;

public class T02_DivisibleBy3_5_15 {

    public static void main(String[] args) {

        divisibleNum();

    }

    public static void divisibleNum(){

        String str15 = "";
        String str5 = "";
        String str3 = "";

        for (int i = 1 ; i <= 100 ; i++){
            if (i % 3 ==0 && i % 5 == 0){
                str15 += i +" ";
            }
            if (i % 3 ==0){
                str3 += i +" ";
            }
            if ( i % 5 == 0){
                str5 += i +" ";
            }
        }

        System.out.println(" Divisible Ву 15 " +str15);
        System.out.println(" Divisible Ву 5 " + str5);
        System.out.println(" Divisible Ву 3 " + str3);
    }


}
/*
2.Numbers -- Divisible by 3, 5, 15

    Write а program that can print the numbers between 1 ~ 100 that can bе divisible by 3, 5, and 15.

    If the number can be divisible by 3, 5 and 15, then it should only be displayed in Divisible By 15' section.
    If the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in Divisible By 3' section.
    If the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in Divisible By 5' section.

    OutPut:

    Divisible Ву 15 15 30 45 60 75 90
    Divisible Ву 5 510 20 25 35 40 50 55 65 70 80 85 95 100
    Divisible Ву 3 3 6 9 12 18 2124 27 33 36 39 42 48 5154 57 63 66 69 72 78 81 84 87 93 96 99

 */