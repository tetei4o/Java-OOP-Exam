import java.util.Scanner;

public class Sums2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        double prime = 0;
        double nonPrime = 0;
        boolean isPrime = true;
        while (!input.equals("stop")) {
            double num = Double.parseDouble(input);
            if (num < 0) {
                System.out.println("Number is negative.");
                input = scan.nextLine();
                continue;
            }
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                } else {
                    isPrime = true;
                }
            }
            if (isPrime) {
                prime += num;
            } else {
                nonPrime += num;
            }
            input = scan.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d\n", (int) prime);
        System.out.printf("Sum of all non prime numbers is: %d", (int) nonPrime);
    }
}
