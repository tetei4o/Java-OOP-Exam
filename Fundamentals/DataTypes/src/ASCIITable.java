import java.util.Scanner;

public class ASCIITable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        for (int i = num1; i <= num2; i++) {
            char a = (char) i;
            System.out.print(a + " ");
        }
    }
}
