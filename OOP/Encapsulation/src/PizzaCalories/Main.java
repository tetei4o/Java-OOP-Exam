package PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] pizzaData = scan.nextLine().split(" ");
        String[] doughData = scan.nextLine().split(" ");
        try {
            Pizza pizza = new Pizza(pizzaData[1], Integer.parseInt(pizzaData[2]));
            Dough dough = new Dough(doughData[1], doughData[2], Double.parseDouble(doughData[3]));
            pizza.setDough(dough);
            String input = scan.nextLine();
            while (!input.equals("END")) {
                String[] toppingData = input.split(" ");
                Topping topping = new Topping(toppingData[1], Double.parseDouble(toppingData[2]));
                if (pizza.getToppings().size() < pizza.getNumberOfToppings()) {
                    pizza.addTopping(topping);
                }
                input = scan.nextLine();
            }
            System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
