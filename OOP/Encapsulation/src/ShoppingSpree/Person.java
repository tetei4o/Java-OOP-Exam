package ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<String> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setMoney(double money) {
        if (money > 0) {
            this.money = money;
        } else {
            throw new IllegalArgumentException("Money cannot be negative");
        }
    }

    private void setName(String name) {
        if (name.trim().length() > 0) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }

    public String getName() {
        return name;
    }

    public void buyProduct(Product product) {
        if (money - product.getCost() > 0) {
            products.add(product.getName());
            money = money - product.getCost();
            System.out.printf("%s bought %s", name, product.getName());
        } else {
            System.out.printf("%s can't afford %s\n", name, product.getName());
        }
    }
}
