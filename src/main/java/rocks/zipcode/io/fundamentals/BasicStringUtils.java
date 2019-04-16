package rocks.zipcode.io.fundamentals;

import java.util.Arrays;
import java.util.List;

public class BasicStringUtils {
    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(char[] chars) {
      String newString = String.copyValueOf(chars);

        return newString;
    }

    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(Character[] chars) {
        String newString = "";
        for(Character c : chars){
            newString += c;
        }

        return newString;
    }

    /**
     * @param string - string to be manipulated
     * @return identical string with lowercase and uppercase vowels removed
     */
    public static String removeAllVowels(String string) {
        Character vowels[] = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};

        List<Character> al = Arrays.asList(vowels);

        StringBuffer sb = new StringBuffer(string);

        for (int i = 0; i < sb.length(); i++) {

            if(al.contains(sb.charAt(i))){
                sb.replace(i, i+1, "") ;
                i--;
            }
        }


        return sb.toString();
    }


    /**
     * @param string             - string to be manipulated
     * @param charactersToRemove - characters to be removed from string
     * @return
     */
    public static String removeSpecifiedCharacters(String string, String charactersToRemove) {


        char[] originalCharArray= string.toCharArray();
        char[] removeCharArray= charactersToRemove.toCharArray();
        int start,end=0;

        //tempBoolean automatically initialized to false ,size 128 assumes ASCII
        boolean[]  tempBoolean = new boolean[128];

        //Set flags for the character to be removed
        for(start=0;start < removeCharArray.length;++start)
        {
            tempBoolean[removeCharArray[start]]=true;
        }

        //loop through all characters ,copying only if they are flagged to false
        for(start=0;start < originalCharArray.length;++start)
        {
            if(!tempBoolean[originalCharArray[start]])
            {
                originalCharArray[end++]=originalCharArray[start];
            }
        }


        return new String(originalCharArray,0,end);
    }

}
