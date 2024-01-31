import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        intList.add(3);
        intList.add(3);
        intList.add(3);
        intList.add(3);
        intList.add(3);
        System.out.println(String.join(", ", intList.toString()).replaceAll("[\\[\\]]", ""));
        int[] intArray = {1, 2, 3};
        System.out.println(String.join(", ", Arrays.toString(intArray).replaceAll("[\\[\\]]", "")));
    }
}
