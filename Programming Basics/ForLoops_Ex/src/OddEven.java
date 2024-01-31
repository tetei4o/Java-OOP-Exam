import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double oddSum = 0;
        double oddMin = Double.POSITIVE_INFINITY;
        double oddMax = Double.NEGATIVE_INFINITY;
        double evenSum = 0;
        double evenMin = Double.POSITIVE_INFINITY;
        double evenMax = Double.NEGATIVE_INFINITY;
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= n; i++) {
            double num = Double.parseDouble(scan.nextLine());
            if (i % 2 == 0) {
                evenSum += num;
                if (num > evenMax) {
                    evenMax = num;
                }
                if (num < evenMin) {
                    evenMin = num;
                }
            } else {
                oddSum += num;
                if (num > oddMax) {
                    oddMax = num;
                }
                if (num < oddMin) {
                    oddMin = num;
                }
            }
        }
        if (oddSum == 0) {
            System.out.printf("OddSum=%.2f,\n" + "OddMin=No,\n" +
                    "OddMax=No,\n" + "EvenSum=%.2f,\n" + "EvenMin=No,\n" + "EvenMax=No", oddSum, evenSum);
        } else if (evenSum == 0) {
            System.out.printf("OddSum=%.2f,\n" + "OddMin=%.2f,\n" + "OddMax=%.2f,\n" +
                    "EvenSum=%.2f,\n" + "EvenMin=No,\n" + "EvenMax=No", oddSum, oddMin, oddMax, evenSum);
        } else {
            System.out.printf("OddSum=%.2f,\n" + "OddMin=%.2f,\n" + "OddMax=%.2f,\n" + "EvenSum=%.2f,\n" + "EvenMin=%.2f,\n" + "EvenMax=%.2f", oddSum, oddMin, oddMax, evenSum, evenMin, evenMax);
        }
    }
}
