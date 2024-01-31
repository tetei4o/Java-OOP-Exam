package CreateArray;

import java.lang.reflect.Array;

public class ArrayCreator {

    public static <T> T[] create(int length, T item) {
        T[] arr = (T[]) Array.newInstance(item.getClass(), length);
        for (int i = 0; i < length; i++) {
            arr[i] = item;
        }
        return arr;
    }
}
