import java.util.Scanner;

public class InvalidNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        boolean isValid = (num >= 100 && num <= 200 || num == 0);
        if (!isValid) {
            System.out.println("invalid");
        }
    }
}
