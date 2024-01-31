import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        int pieces = width * length;
        String input = scan.nextLine();
        while (!input.equals("STOP")) {
            int eaten = Integer.parseInt(input);
            pieces -= eaten;
            if (pieces < 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(pieces));
                return;
            }
            input = scan.nextLine();
        }
        System.out.printf("%d pieces are left.", pieces);
    }
}
