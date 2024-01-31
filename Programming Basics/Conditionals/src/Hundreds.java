import java.util.Scanner;

public class Hundreds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        boolean lessThan = num < 100;
        boolean greaterThan = num > 200;
        if (lessThan) {
            System.out.println("Less than 100");
        } else if (greaterThan) {
            System.out.println("Greater than 200");
        } else {
            System.out.println("Between 100 and 200");
        }
    }
}
