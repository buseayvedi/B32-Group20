package buse_ayvedi.week06;

import java.util.Collections;

public class T1_PasswordValidationTask {

    public static void main(String[] args) {

        System.out.println("passwordValidation(\"123dsjsklskd\") = " + passwordValidation("123"));

    }
    public static boolean passwordValidation(String password){
        boolean passwordValid = true;
        if (password.length()<6 || password.contains(" ")){
            passwordValid = false;
            System.err.println("Password MUST be at least have 6 characters and should not contain space");
            System.exit(1);
        }
        int numberUpperCase = 0;
        int numberLowerCase = 0 ;
        int numberOfSpeacialChar = 0;
        int numberOfDigit = 0;
        for (Character each : password.toCharArray()){
            if (Character.isUpperCase(each)){
                numberUpperCase++;
            }
            if (Character.isLowerCase(each)){
                numberLowerCase++;
            }
            if (!Character.isLowerCase(each) && !Character.isUpperCase(each) && !Character.isDigit(each) ){
                numberOfSpeacialChar++;
            }
            if (Character.isDigit(each)){
                numberOfDigit++;
            }
        }
        if (numberUpperCase == 0){
            passwordValid = false;
            System.err.println("PassWord should at least contain one upper case letter");
            System.exit(1);
        }
        if (numberLowerCase == 0 ) {
            passwordValid = false;
            System.err.println("PassWord should at least contain one lowercase letter");
            System.exit(1);
        }
        if (numberOfSpeacialChar == 0){
            passwordValid = false;
            System.err.println("Password should at least contain one special characters");
            System.exit(1);
        }
        if (numberOfDigit == 0){
            passwordValid = false;
            System.err.println("Password should at least contain a digit");
            System.exit(1);
        }

       return true;
    }
}
/*
String -- Password Validation Task
    1. Write a return method that can verify if a password is valid or not.
    requirements:
    1. Password MUST be at least have 6 characters and should not contain space
    2. PassWord should at least contain one upper case letter
    3. PassWord should at least contain one lowercase letter
    4. Password should at least contain one special characters
    5. Password should at least contain a digit
    if all requirements above are met, the method returns true, otherwise returns false

 */