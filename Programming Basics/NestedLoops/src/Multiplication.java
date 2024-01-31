import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = Integer.parseInt(scan.nextLine());
        int finish = Integer.parseInt(scan.nextLine());
        int num = Integer.parseInt(scan.nextLine());

        int counter = 0;
        boolean isCombinationFound = false;
        outer:
        for (int i = start; i <= finish; i++) {
            for (int j = start; j <= finish; j++) {
                counter++;
                if (i + j == num) {
                    isCombinationFound = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, num);
                    break outer;
                }
            }

        }
        if (!isCombinationFound) {
            System.out.printf("%d combinations - neither equals %d", counter, num);
        }
    }
}

