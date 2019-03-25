package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    private static final Character[] VOWELS = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};

    public static Boolean hasVowels(String word) {
        for (int i = 0; i < VOWELS.length; i++) {
            if(word.contains(VOWELS[i].toString())) {
                return true;
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        Integer firstIndex = 0;

        while (firstIndex == 0) {
            for (int i = 0; i < VOWELS.length; i++) {
                if (word.contains(VOWELS[i].toString())) {
                    firstIndex = i;
                    break;
                } else if (!word.contains(VOWELS[i].toString())) {
                    firstIndex = -1;
                }
            }
        }
        return firstIndex;
    }


    public static Boolean startsWithVowel(String word) {
        char[] charArr = word.toCharArray();

        for (int i = 0; i < VOWELS.length; i++) {
            if(charArr[0] == VOWELS[i]) {
                return true;
            }
        }
        return false;
    }

    public static Boolean isVowel(Character character) {
        for (int i = 0; i < VOWELS.length; i++) {
            if(character == VOWELS[i]) {
                return true;
            }
        }
        return false;
    }
}
