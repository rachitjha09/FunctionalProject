import java.util.Comparator;

public class Fish {
    private String species;
    private double weight;

    @Override
    public String toString() {
        return "species='" + species + '\'' +
                ", weight=" + weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Fish(String species, double weight) {
        this.species = species;
        this.weight = weight;
    }

}
