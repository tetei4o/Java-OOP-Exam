import java.util.Scanner;

public class SmallestNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int min = Integer.MAX_VALUE;
        while (!input.equals("Stop")) {
            int num = Integer.parseInt(input);
            if (num < min) {
                min = num;
            }
            input = scan.nextLine();
        }
        System.out.println(min);
    }
}
