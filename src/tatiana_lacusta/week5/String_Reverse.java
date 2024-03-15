package tatiana_lacusta.week5;

public class String_Reverse {

    public static void main(String[] args) {


        String str = "ABCD";

        String result = reverse(str);


        System.out.println(result);

    }
    public static String reverse(String str){
        String reverse = "";

        for(int i = str.length() - 1 ; i >= 0; i-- ){
            reverse += str.charAt(i);
        }

        return reverse;


    }
}

/*
Write a return method that can reverse String
Ex: Reverse "ABCD" ==> DCBA
 */