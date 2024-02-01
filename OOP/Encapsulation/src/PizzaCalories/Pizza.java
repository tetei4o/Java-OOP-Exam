package PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private final List<Topping> toppings;
    private int numberOfToppings;

    public Pizza(String name, int numberOfToppings) {
        setToppings(numberOfToppings);
        setName(name);
        this.toppings = new ArrayList<>();
    }

    private void setName(String name) {
        if (!name.trim().isEmpty() && name.length() < 16) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
    }

    private void setToppings(int numberOfToppings) {
        if (numberOfToppings > -1 && numberOfToppings < 11) {
            this.numberOfToppings = numberOfToppings;
        } else {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public String getName() {
        return name;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public int getNumberOfToppings() {
        return numberOfToppings;
    }

    public double getOverallCalories() {
        double sum = 0;
        sum = sum + this.dough.calculateCalories();
        for (Topping topping : toppings) {
            sum = sum + topping.calculateCalories();
        }
        return sum;
    }
}
