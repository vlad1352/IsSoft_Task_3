package domain.train.carriage;

import domain.cargo.Cargo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CargoCarriage extends Carriage {

    private final double maxWeight;
    private List<Cargo> cargosList = new ArrayList<>();
    private double weight = 0;

    public CargoCarriage(double maxWeight, String number) {
        this.maxWeight = maxWeight;
        super.setNumber(number);
    }

    public CargoCarriage(double maxWeight) {
        this.maxWeight = maxWeight;
        super.setNumber(UUID.randomUUID().toString());
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public List<Cargo> getCargosList() {
        return cargosList;
    }

    public void setCargosList(List<Cargo> cargosList) {
        this.cargosList = cargosList;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight() {
        double currWeight = 0;
        for(Cargo cargo: cargosList) {
            currWeight += cargo.getWeight();
        }
        this.weight = currWeight;
    }

}
