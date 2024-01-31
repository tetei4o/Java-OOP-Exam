import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bookPages = Integer.parseInt(scan.nextLine());
        int pagesInHour = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());
        double result = (bookPages / pagesInHour) / days;
        System.out.println(result);
    }
}
