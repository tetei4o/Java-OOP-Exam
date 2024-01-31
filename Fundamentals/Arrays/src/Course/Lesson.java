package Course;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String numOneLine = "1 4 5 6 9";
        String[] splitItems = numOneLine.split(" ");
        int[] array = Arrays.stream(splitItems)
                .mapToInt(Integer::parseInt).toArray();
    }
}

