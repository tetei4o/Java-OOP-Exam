import java.util.Scanner;

public class Sums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        for (int i = num1; i <= num2; i++) {
            String currentNum = "" + i;
            int oddSum = 0;
            int evenSum = 0;
            for (int j = 0; j < currentNum.length(); j++) {
                int currentDigit = Integer.parseInt("" + currentNum.charAt(j));
                if (j % 2 == 0) {
                    evenSum += currentDigit;
                } else {
                    oddSum += currentDigit;
                }
            }
            if (oddSum == evenSum) {
                System.out.print(i + " ");
            }
        }
    }
}
