package Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Map<String, Double> productsAndPrice = new LinkedHashMap<>(); //продукт -> ед. цена
        Map<String, Integer> productsAndQuantity = new LinkedHashMap<>(); //продукт -> брой
        while (!input.equals("buy")) {
            String productName = input.split(" ")[0];
            double productPrice = Double.parseDouble(input.split(" ")[1]);
            int productQuantity = Integer.parseInt(input.split(" ")[2]);
            productsAndPrice.put(productName, productPrice);
            if (!productsAndQuantity.containsKey(productName)) {
                productsAndQuantity.put(productName, productQuantity);
            } else {
                productsAndQuantity.replace(productName, productsAndQuantity.get(productName) + productQuantity);
            }
            input = scan.nextLine();
        }
        for (Map.Entry<String, Double> entry : productsAndPrice.entrySet()) {
            System.out.printf("%s -> %.2f\n", entry.getKey(), productsAndQuantity.get(entry.getKey()) * entry.getValue());
        }
    }
}
