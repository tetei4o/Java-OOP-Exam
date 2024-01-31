package Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> intList = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int[] bombNums = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = 0;
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) == bombNums[0]) {
                for (int j = 1; j <= bombNums[1]; j++) {
                    if (i - j >= 0) {
                        intList.remove(i - j);
                    }
                    if (i + j < intList.size()) {
                        intList.remove(i + j);
                    }
                }
                intList.remove(i);
                i = -1;
            }
        }
        for (int bombNum : bombNums) {
            sum += bombNum;
        }
        System.out.println(sum);
    }
}
