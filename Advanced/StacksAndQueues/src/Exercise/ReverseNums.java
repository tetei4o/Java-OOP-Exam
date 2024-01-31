package Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String[] numbers = scan.nextLine().split("\\s+");
        for (String number : numbers) {
            stack.push(Integer.parseInt(number));
        }
        System.out.println(stack.toString().replaceAll("[\\[\\],]", ""));
    }
}
