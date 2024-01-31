import java.util.Scanner;

public class AccBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        double total = 0.0;
        while (!input.equals("NoMoreMoney")) {
            double num = Double.parseDouble(input);
            if (num < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            total += num;
            System.out.printf("Increase: %.2f\n", num);
            input = scan.nextLine();
        }
        System.out.printf("Total: %.2f", total);
    }
}
