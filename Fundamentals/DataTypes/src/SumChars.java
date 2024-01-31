import java.util.Scanner;

public class SumChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfLines = Integer.parseInt(scan.nextLine());
        char n;
        int sum = 0;
        for (int i = 0; i < numOfLines; i++) {
            n = scan.nextLine().charAt(0);
            sum += n;
        }
        System.out.println("The sum equals: " + sum);
    }
}
