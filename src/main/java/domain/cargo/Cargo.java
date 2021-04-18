package domain.cargo;

public class Cargo {
    private final long number;
    private final double weight;
    private final String  name;

    public Cargo(long number, double weight, String name) {
        this.number = number;
        this.weight = weight;
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
