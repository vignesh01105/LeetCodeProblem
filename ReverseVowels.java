import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class ReverseVowels {

    public static String reverseVowels(String s) {

        //Retrieve vowels for given string
        StringBuilder vowels = new StringBuilder();
        CharacterIterator ch = new StringCharacterIterator(s);
        StringBuilder output = new StringBuilder();
        for (char c = ch.first();c!=CharacterIterator.DONE;c= ch.next()){
            if (c == 'a'|| c== 'A'|| c == 'e'|| c== 'E'||c == 'I'|| c== 'i'||c == 'o'|| c== 'O'||c == 'u'|| c== 'U'){
                vowels = vowels.append(c);
            }
        }
        String vow = vowels.toString();
        CharacterIterator ch1 = new StringCharacterIterator(vow);
        // Traverse Original string
        char c1 = ch1.last();
        char c= ch.first();
        do {
            if (c == 'a'|| c== 'A'|| c == 'e'|| c== 'E'||c == 'I'|| c== 'i'||c == 'o'|| c== 'O'||c == 'u'|| c== 'U'){
                output.append(c1);
                c1=ch1.previous();
            }
            else {
                output.append(c);
            }
            c=ch.next();


        }while (c!=CharacterIterator.DONE);

        System.out.println(output);
        return output.toString();


    }

    public static void main (String[] args){
        String word = "IceCreAm";
        reverseVowels(word);
    }
}
