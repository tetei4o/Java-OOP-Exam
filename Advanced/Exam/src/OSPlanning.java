import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class OSPlanning {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<Integer> tasks = new ArrayDeque<>();
        ArrayDeque<Integer> threads = new ArrayDeque<>();
        Arrays.stream(scan.nextLine().split(", ")).map(Integer::parseInt).forEach(tasks::push);
        Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).forEach(threads::offer);
        int killerValue = Integer.parseInt(scan.nextLine());
        while (true) {
            if (tasks.peek() <= threads.peek()) {
                tasks.pop();
                threads.poll();
            } else {
                threads.poll();
            }
            if (tasks.peek() == killerValue) {
                System.out.printf("Thread with value %d killed task %d\n", threads.peek(), killerValue);
                break;
            }
        }
        for (Integer thread : threads) {
            System.out.print(thread + " ");
        }
    }
}
