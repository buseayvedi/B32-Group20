package sevgi_esen.week4;

public class RemoveDuplicates {

    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCC"));
    }

    public static String removeDup(String str){

        String str2 = "";

        for (String each : str.split("")){
            if (!(str2.contains(each))){
                str2 += each;
            }
        }
        return str2;

    }

}
/*
String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC
 */

