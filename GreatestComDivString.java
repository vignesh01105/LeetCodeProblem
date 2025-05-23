import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class GreatestComDivString {

    public static void divisor(String word, String word1) {


        int length = word.length();
        int length1 = word1.length();
        String base = null;

        if (length >= length1) {
            base = word1;

        } else {
            base = word;
        }

        for (int i = base.length(); i >= 1; i--) {
            base = base.substring(0,i);
            if (isReplacedByBaseString(word,word1,base)){
                System.out.println("Greatest Common Divisor of String" +base);
            }


        }


    }
    public static  boolean isReplacedByBaseString(String firstString, String secondString, String baseString){
        if (firstString.length() % baseString.length() == 0 &&  secondString.length() % baseString.length() == 0) {
            return firstString.replace(baseString, "").isEmpty() && secondString.replace(baseString, "").isEmpty();

        }
        return false;
    }

    //Prime number logic this is not for this code program.
    static boolean prime_number(int length1) {

        System.out.println("square root of the value" + Math.sqrt(length1));
        for (int i = 2; i <= Math.sqrt(length1); i++) {

            if (length1 % i == 0) {

                return false;
            }


        }
        return true;
    }

    public static void main(String args[]) {
        String s = "ABCAB";
        String s2 = "ABCABC";
        divisor(s, s2);
    }

}