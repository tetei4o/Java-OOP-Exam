import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int b = 0;
        while (n > b) {
            int c = Integer.parseInt(scan.nextLine());
            b += c;
        }
        System.out.println(b);
    }
}
