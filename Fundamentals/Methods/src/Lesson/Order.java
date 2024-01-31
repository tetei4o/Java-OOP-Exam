package Lesson;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        int quantity = Integer.parseInt(scan.nextLine());
        findSum(product, quantity);
    }

    private static void findSum(String product, int quantity) {
        double price;
        switch (product){
            case "coffee":
                price = 1.50*quantity;
                break;
            case "water":
                price = 1.50*quantity;
                break;
            case "coke":
                price = 1.50*quantity;
                break;
            case "snacks":
                price = 1.50*quantity;
                break;
        }
    }
}
