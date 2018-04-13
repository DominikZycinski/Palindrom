package pl.zycinski;

/**
 * @author Dominik Zycinski
 * @version 1.01, 24/03/2018
 * @see java.lang
 * @since JDK1.0
 */


public class Test {

    /** Main method *
     *@param args command-line arguments*/
    public static void main(String[] args) {

        String text = "Was it a car or a cat I saw?";

        if(Palindrom.isPalindrom(text) == null){
            System.out.println("You do not input any text");
        }
        else if(Palindrom.isPalindrom(text)){
            System.out.println("This text '" + text +"' is a palindrom" );
        }
        else{
            System.out.println("This text '" + text +"' is not a palindrom");
        }

    }

}
