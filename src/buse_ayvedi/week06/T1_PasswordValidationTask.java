package buse_ayvedi.week06;


public class T1_PasswordValidationTask {

    public static void main(String[] args) {

//<<<<<<< buse
//        System.out.println("passwordValidation= " + passwordValidation("123"));

        System.out.println("passwordValidation(\"1234AAAA\") = " + passwordValidation("1234AAAA"));

//        System.out.println("passwordValidation(\"dfjlskjf1232AAA!!!\") = " + passwordValidation("dfjlskjf1232AAA!!!"));
//
//        System.out.println("passwordValidation(\"lds saljdk\") = " + passwordValidation("lds saljdk"));
//=======
        System.out.println("passwordValidation(\"123dsjsklskd\") = " + passwordValidation("123"));

        System.out.println("passwordValidation(\"1234AAAA\") = " + passwordValidation("1234AAAA"));

        System.out.println("passwordValidation(\"dfjlskjf1232AAA!!!\") = " + passwordValidation("dfjlskjf1232AAA!!!"));

        System.out.println("passwordValidation(\"lds saljdk\") = " + passwordValidation("lds saljdk"));
//>>>>>>> master

    }
    public static boolean passwordValidation(String password){

        if (password.length()<6 || password.contains(" ")){
            System.err.println("Password MUST be at least have 6 characters and should not contain space");
            return false;
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
            System.err.println("PassWord should at least contain one upper case letter");
            return false;
        }
        if (numberLowerCase == 0 ) {
            System.err.println("PassWord should at least contain one lowercase letter");
            return false;

        }
        if (numberOfSpeacialChar == 0){
            System.err.println("Password should at least contain one special characters");
            return false;
        }
        if (numberOfDigit == 0){
            System.err.println("Password should at least contain a digit");
            return false;

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