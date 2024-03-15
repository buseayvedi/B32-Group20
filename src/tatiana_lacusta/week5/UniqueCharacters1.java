package tatiana_lacusta.week5;

public class UniqueCharacters1 {

    public static void main(String[] args) {

        String str = "AAAABBBCCCDEF";

        String unique = "";

        for (int i = 0; i < str.length(); i++) { // i: index numbers of str
            char each = str.charAt(i);

            if(str.indexOf(each) == str.lastIndexOf(each)  ){
                unique += each;
            }

        }


        System.out.println(unique);

    }
}
