package PizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setWeight(double weight) {
        if (weight > 0 && weight < 201) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (bakingTechnique.equals("Crispy") || bakingTechnique.equals("Homemade") || bakingTechnique.equals("Chewy")) {
            this.bakingTechnique = bakingTechnique;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setFlourType(String flourType) {
        if (flourType.equals("White") || flourType.equals("Wholegrain")) {
            this.flourType = flourType;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    public double calculateCalories() {
        double modifierFlour = 0;
        double modifierTechnique = 0;
        switch (this.flourType) {
            case "White":
                modifierFlour = 1.5;
                break;
            case "Wholegrain":
                modifierFlour = 1.0;
                break;
        }
        switch (this.bakingTechnique) {
            case "Crispy":
                modifierTechnique = 0.9;
                break;
            case "Chewy":
                modifierTechnique = 1.1;
                break;
            case "Homemade":
                modifierTechnique = 1.0;
                break;
        }
        return weight * 2 * modifierTechnique * modifierFlour;
    }
}
