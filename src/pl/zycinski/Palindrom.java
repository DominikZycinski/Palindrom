package pl.zycinski;

/**
 * @author Dominik Zycinski
 * @version 1.01, 24/03/2018
 * @see java.lang
 * @since JDK1.0
 */

/**Used to check if the texts is a palindrom*/
public class Palindrom {

    /**Default constructor*/
    public Palindrom(){};


    /** Method that checks if text is a palindrom
     *  @param text This is the text which we want to check if it is a palindrome
     *  @return <p> Null if the variable is null or it is a empty string. </p>
     *          <p>True if the variable is a palindrom.  </p>
     *          <p>False if the variable is not a palindrom.  </p>
     * */
    public static Boolean isPalindrom(String text)
    {
        if(text == null || text.length() ==0 )
            return null;

        if(text.length()==1)
            return true;

        String reverseText = new StringBuilder(text).reverse().toString();

        String onlyLettersReverseText = onlyLetters(reverseText);
        String onlyLettersText = onlyLetters(text);

        return onlyLettersReverseText.equals(onlyLettersText);

    }


    /**Method which deletes punctuation marks and structural characters and changes size of the letters to small
     *  @param text This is the text which we want delete all white characters and punctuation from the text
     *  @return <p> The modified text  </p>
     * */
    public static String onlyLetters(String text)
    {

        String newText="";
        for(int i = 0 ; i < text.length(); i++){

            if(Character.isLetter(text.charAt(i))){
                newText+=text.charAt(i);

            }
        }

        return newText.toLowerCase();
    }


}
