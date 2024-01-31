package groomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {
    private final List<Pet> pets;
    private final int capacity;

    public GroomingSalon(int capacity) {
        this.capacity = capacity;
        this.pets = new ArrayList<>();
    }

    public void add(Pet pet) {
        if (this.pets.size() < capacity) {
            this.pets.add(pet);
        }
    }

    public boolean remove(String name) {
        for (Pet pet : this.pets) {
            if (pet.getName().equals(name)) {
                this.pets.remove(pet);
                return true;
            }
        }
        return false;
    }

    public Pet getPet(String name, String owner) {
        for (Pet pet : this.pets) {
            if (pet.getName().equals(name) && pet.getOwner().equals(owner)) {
                return pet;
            }
        }
        return null;
    }

    public int getCount() {
        return this.pets.size();
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        String toAppend = "The grooming salon has the following clients:";
        sb.append(toAppend).append(System.lineSeparator());
        for (Pet pet : this.pets) {
            sb.append(pet.getName()).append(" ").append(pet.getOwner()).append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}
