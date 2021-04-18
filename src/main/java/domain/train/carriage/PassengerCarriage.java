package domain.train.carriage;

import domain.user.Passenger;

import java.util.ArrayList;
import java.util.List;

public class PassengerCarriage extends Carriage {

    private final int maxNumberOfPassengers;
    private List<Passenger> passengers = new ArrayList<>();
    private int numberOfPassengers;

    public PassengerCarriage(int maxNumberOfPassengers) {
        this.maxNumberOfPassengers = maxNumberOfPassengers;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public int getMaxNumberOfPassengers() {
        return maxNumberOfPassengers;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers() {
        this.numberOfPassengers = passengers.size();
    }
}
