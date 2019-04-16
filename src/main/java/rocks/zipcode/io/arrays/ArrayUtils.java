package rocks.zipcode.io.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 24/01/2019.
 */
public class ArrayUtils {
    /**
     * @param start - value to begin counting
     * @param end   - value to stop counting
     * @return array of all integers between `start` and `stop`
     */
    public static Integer[] getRange(Integer start, Integer end) {
        Integer[] range = new Integer[end - start + 1];

        for(int i = 0; i < range.length; i++){
            range[i] = start + i;
        }

        return range;

    }

    /**
     * @param array - array to be unboxed
     * @return array with identical contents in primitive-array form
     */
    public static char[] unbox(Character[] array) {
        char[] unbox = new char[array.length];

        for (int i = 0; i < unbox.length; i++) {
             unbox[i] = array[i];

        }

        return unbox;
    }

    /**
     * @param array - array to be boxed
     * @return array with identical contents in nonprimitive-array form
     */
    public static Character[] box(char[] array) {
       Character[] box = new Character[array.length];

        for (int i = 0; i < box.length; i++) {
            box[i] = array[i];

        }


        return box;
    }
}
