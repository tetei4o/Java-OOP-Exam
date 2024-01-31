import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String op = scanner.nextLine();
        int result1;
        double result2;
        switch (op) {
            case "+":
                result1 = num1 + num2;
                if (result1 % 2 == 0) {
                    System.out.printf("%d %s %d = %d - even", num1, op, num2, result1);
                } else {
                    System.out.printf("%d %s %d = %d - odd", num1, op, num2, result1);
                }
                break;
            case "-":
                result1 = num1 - num2;
                if (result1 % 2 == 0) {
                    System.out.printf("%d %s %d = %d - even", num1, op, num2, result1);
                } else {
                    System.out.printf("%d %s %d = %d - odd", num1, op, num2, result1);
                }
                break;
            case "*":
                result1 = num1 * num2;
                if (result1 % 2 == 0) {
                    System.out.printf("%d %s %d = %d - even", num1, op, num2, result1);
                } else {
                    System.out.printf("%d %s %d = %d - odd", num1, op, num2, result1);
                }
                break;
            case "/":
                if (num2 != 0) {
                    result2 = (double) num1 / (double) num2;
                    System.out.printf("%d %s %d = %.2f", num1, op, num2, result2);
                } else {
                    System.out.printf("Cannot divide %d by zero", num1);
                }
                break;
            case "%":
                if (num2 != 0) {
                    result1 = num1 % num2;
                    System.out.printf("%d %s %d = %d", num1, op, num2, result1);
                } else {
                    System.out.printf("Cannot divide %d by zero", num1);
                }
        }
    }
}
