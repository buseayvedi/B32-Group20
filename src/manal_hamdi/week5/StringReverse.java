package manal_hamdi.week5;

public class StringReverse {
    public static void main(String[] args) {
        System.out.println(reverse_string("manal"));
        System.out.println(reverse_string("school"));
    }
    public static String reverse_string(String str){
String reverse = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse += str.charAt(i);
        }

      return reverse;
    }
    /*
Write a return method that can reverse  String
 Ex: Reverse("ABCD"); ==> DCBA
 */

}
