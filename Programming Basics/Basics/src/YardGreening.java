import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double area = Double.parseDouble(scan.nextLine());
        double price = area * 7.61;
        double discount = 0.18 * price;
        double finalPrice = price - discount;
        System.out.println("The final price is: " + finalPrice + " lv.");
        System.out.println("The discount is: " + discount + " lv.");
    }
}
