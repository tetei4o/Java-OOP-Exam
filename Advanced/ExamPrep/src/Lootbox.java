import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Lootbox {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<Integer> firstBox = new ArrayDeque<>();
        ArrayDeque<Integer> secondBox = new ArrayDeque<>();
        Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).forEach(firstBox::offer);
        Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).forEach(secondBox::push);
        int items = 0;
        while (true) {
            if (firstBox.isEmpty()) {
                System.out.println("First lootbox is empty");
                break;
            }
            if (secondBox.isEmpty()) {
                System.out.println("Second lootbox is empty");
                break;
            }
            int num1 = firstBox.poll();
            int num2 = secondBox.pop();
            if ((num1 + num2) % 2 == 0) {
                items = items + num1 + num2;
            } else {
                firstBox.addFirst(num1);
                firstBox.addLast(num2);
            }
        }
        if (items >= 100) {
            System.out.println("Your loot was epic! Value: " + items);
        } else {
            System.out.println("Your loot was poor... Value: " + items);
        }
    }
}
