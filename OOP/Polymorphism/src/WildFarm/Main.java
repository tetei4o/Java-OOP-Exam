package WildFarm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        List<Mammal> animals = new ArrayList<>();
        while (!input.equals("End")) {
            String[] animalInfo = input.split(" ");
            Mammal mammal;
            switch (animalInfo[0]) {
                case "Cat":
                    mammal = new Cat(animalInfo[1], animalInfo[0], Double.parseDouble(animalInfo[2]), animalInfo[3], animalInfo[4]);
                    break;
                case "Mouse":
                    mammal = new Mouse(animalInfo[1], animalInfo[0], Double.parseDouble(animalInfo[2]), animalInfo[3]);
                    break;
                case "Zebra":
                    mammal = new Zebra(animalInfo[1], animalInfo[0], Double.parseDouble(animalInfo[2]), animalInfo[3]);
                    break;
                case "Tiger":
                    mammal = new Tiger(animalInfo[1], animalInfo[0], Double.parseDouble(animalInfo[2]), animalInfo[3]);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + animalInfo[0]);
            }
            animals.add(mammal);
            System.out.println(mammal.makeSound());
            String[] foodInfo = scan.nextLine().split(" ");
            Food food;
            if (foodInfo[0].equals("Vegetable")) {
                food = new Vegetable(Integer.parseInt(foodInfo[1]));

            } else {
                food = new Meat(Integer.parseInt(foodInfo[1]));
            }
            try {
                mammal.eat(food);
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
            input = scan.nextLine();
        }
        for (Mammal animal : animals) {
            System.out.println(animal.toString());
        }
    }
}
