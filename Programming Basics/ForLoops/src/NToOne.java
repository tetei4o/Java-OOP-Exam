import java.util.Scanner;

public class NToOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        for (int i = num; i > 0; i--) {
            System.out.println(i);
        }
    }
}
