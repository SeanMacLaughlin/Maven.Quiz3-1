package rocks.zipcode.io.quiz3.generics;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        for (SomeType word : array)
            if(ArrayUtility.this.getNumberOfOccurrences(word) % 2 != 0) {
                return word;
            }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        for (SomeType word : array)
            if(ArrayUtility.this.getNumberOfOccurrences(word) % 2 == 0) {
                return word;
            }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        int count = 0;
        for (SomeType word : array) {
            if (word.equals(valueToEvaluate)) {
                count++;
            }
        }
        return count;
    }


    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
//        Stream<SomeType> newArray = Arrays.stream(array);
//
//        newArray.filter(SomeType -> predicate).toArray();

        return null;
    }
}
