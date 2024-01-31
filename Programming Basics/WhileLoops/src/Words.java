import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            String text = scan.nextLine();
            if (text.equals("Stop")) {
                break;
            }
            System.out.println(text);
        }
    }
}
