import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String book = scan.nextLine();
        String input;
        int n = 0;
        while (true) {
            input = scan.nextLine();
            if (!input.equals(book) && !input.equals("No More Books")) {
                n++;
            } else if (input.equals(book)) {
                System.out.printf("You checked %d books and found it.", n);
                break;
            } else if (input.equals("No More Books")) {
                System.out.printf("The book you search is not here!\nYou checked %d books.", n);
                break;
            }
        }
    }
}
