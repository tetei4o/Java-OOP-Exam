import Animals.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String animal = scan.nextLine();
        List<Animal> animals = new ArrayList<>();
        while (!animal.equals("Beast!")) {
            String[] animalInfo = scan.nextLine().split(" ");
            try {
                switch (animal) {
                    case "Cat":
                        animals.add(new Cat(animalInfo[0], Integer.parseInt(animalInfo[1]), animalInfo[2]));
                        break;
                    case "Dog":
                        animals.add(new Dog(animalInfo[0], Integer.parseInt(animalInfo[1]), animalInfo[2]));
                        break;
                    case "Frog":
                        animals.add(new Frog(animalInfo[0], Integer.parseInt(animalInfo[1]), animalInfo[2]));
                        break;
                    case "Tomcat":
                        animals.add(new Tomcat(animalInfo[0], Integer.parseInt(animalInfo[1]), animalInfo[2]));
                        break;
                    case "Kitten":
                        animals.add(new Kitten(animalInfo[0], Integer.parseInt(animalInfo[1]), animalInfo[2]));
                        break;
                }
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
            animal = scan.nextLine();
        }
        for (Animal animal1 : animals) {
            System.out.println(animal1.getClass().getSimpleName());
            System.out.printf("%s %d %s\n", animal1.getName(), animal1.getAge(), animal1.getGender());
            System.out.println(animal1.produceSound());
        }
    }
}
