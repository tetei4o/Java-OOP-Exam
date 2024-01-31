import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int max = Integer.MIN_VALUE;
        while (!input.equals("Stop")) {
            int num = Integer.parseInt(input);
            if (num > max) {
                max = num;
            }
            input = scan.nextLine();
        }
        System.out.println(max);
    }
}
