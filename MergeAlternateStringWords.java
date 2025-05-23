public class MergeAlternateStringWords {
   static void mergeAlternateString(String s1, String s2) {

       // String Builder is mutable, but string is immutable
       // Solve using Character iterator also works uncomment if you want
       /*StringBuilder output = new StringBuilder();
       CharacterIterator ch = new StringCharacterIterator(s1);
       CharacterIterator ch1 = new StringCharacterIterator(s2);
       //do while
       char c= ch.first();
       char c1= ch1.first();
       do {
           if (c != ch.DONE){
               output.append(c);
           }
           if (c1 != ch1.DONE){
               output.append(c1);
           }

           c = ch.next();
           c1 = ch1.next();
       }while ((c != ch.DONE) || (c1 != ch1.DONE));

        System.out.print(output);
   }*/

       //Normal String traverse convert String to Char Array
       StringBuilder output = new StringBuilder();
       char c[] = s1.toCharArray();
       char c1[] = s2.toCharArray();
        int i=0;
        int j=0;

        // for loop does not solve my problem
       /*for (i=0; i<c.length;i++){
           output.append(c[i]);
           if(i>j )
           {
               j++;
           }

           for (;j<c1.length && j<=i ;j++){
               output.append(c1[j]);
           }
       }*/

       do
       {
           if(i<c.length)
           output.append(c[i]);
           if(j<c1.length)
           output.append(c1[j]);

           i++;
           j++;
       }while (i<c.length || j<c1.length);
       System.out.print(output);
       // convert String builder to String.
       output.toString();
   }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        String str = "abc";
        String str2 = "efghi";
        mergeAlternateString(str,str2);

    }
}