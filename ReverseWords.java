import javax.print.DocFlavor;

public class ReverseWords {
    public static String reverseWords(String s) {

        //Extract word from the sentence
        System.out.println(s);
        System.out.println(s.length());
        //remove spaces between the words its regular expression
        String singleSpacedStr = s.replaceAll("\\s+", " ");
        System.out.println(singleSpacedStr);
        System.out.println(singleSpacedStr.length());
        //Remove trailing and leading spaces in string
        String trimmedString = singleSpacedStr.trim();
        System.out.println(trimmedString);
        System.out.println(trimmedString.length());
        //convert string into string array
        String words[] = trimmedString.split(" ");
        System.out.println(words.length);
        StringBuilder output = new StringBuilder();
        System.out.print("");
        //traverse the string from end to start and print the words
        for (int i=words.length-1; i>=0 ;i--){
            output.append(words[i]);
            if (i>0)
            {
                output.append(" ");
            }
        }

        return output.toString();

    }

    public static void main (String[] args){
        String sentence = "  a   good   example ";
        System.out.print(reverseWords(sentence));
    }
}
