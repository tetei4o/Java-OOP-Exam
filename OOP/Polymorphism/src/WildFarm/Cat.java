package WildFarm;

import java.text.DecimalFormat;

public class Cat extends Feline {
    private final String catBreed;

    public Cat(String animalName, String animalType, Double animalWeight, String livingRegion, String catBreed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.catBreed = catBreed;
    }

    public String getCatBreed() {
        return catBreed;
    }

    @Override
    public String makeSound() {
        return "Meowwww";
    }

    @Override
    public void eat(Food food) {
        int quantity = food.getQuantity();
        super.setFoodEaten(super.getFoodEaten() + quantity);
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("##.##");
        return String.format("%s[%s, %s, %s, %s, %d]", this.getClass().getSimpleName(), getAnimalName(), getCatBreed(),df.format(getAnimalWeight()) , getLivingRegion(), getFoodEaten());
    }
}
