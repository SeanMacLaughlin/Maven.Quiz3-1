package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String beforeCapitalizedIndex = str.substring(0, indexToCapitalize);
        Character capitalizedChar = Character.toUpperCase(str.charAt(indexToCapitalize));
        String afterCapitalizedIndex = str.substring(indexToCapitalize + 1);

        return beforeCapitalizedIndex + capitalizedChar + afterCapitalizedIndex;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return characterToCheckFor == baseString.charAt(indexOfString);
    }

    public static String[] getAllSubStrings(String string) {

        Set<String> stringSet = new HashSet<>();

        for (int i = 0; i < string.length(); i++) {
            for (int j = 1; j <= string.length() - i; j++) {
                stringSet.add(string.substring(i, i + j));
            }
        }
        String[] allArr = stringSet.toArray(new String[0]);
        return allArr;
    }


    public static Integer getNumberOfSubStrings(String input){
        ArrayList<String> strList = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            for (int j = 1; j <= input.length() - i; j++) {
                strList.add(input.substring(i, i + j));
            }
        }
        String[] allArr = strList.toArray(new String[0]);


        return allArr.length;
    }
}
