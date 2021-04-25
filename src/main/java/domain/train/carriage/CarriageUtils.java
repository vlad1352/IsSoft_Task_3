package domain.train.carriage;

import domain.cargo.Cargo;
import domain.user.Driver;
import domain.user.Passenger;

public class CarriageUtils {

    private static boolean checkWeight(CargoCarriage cargoCarriage, double weight) {
        return !(cargoCarriage.getMaxWeight() - cargoCarriage.getWeight() < weight);
    }

    public static void addCargo(Cargo cargo, CargoCarriage cargoCarriage) {
        if(checkWeight(cargoCarriage, cargo.getWeight())) {
            cargoCarriage.getCargosList().add(cargo);
            cargoCarriage.setWeight();
        } else {
            throw new IllegalArgumentException("This carriage have not enough space");
        }
    }

    public static void addDriver(Locomotive locomotive, Driver driver) {
        if(checkDriver(driver)) {
            locomotive.setDriver(driver);
        } else {
            throw new IllegalArgumentException("driver must be over 18 years and has license");
        }
    }

    private static boolean checkDriver(Driver driver) {
        return driver.getAge().intValue() >= 18 && driver.isHaveLicence();
    }

    private static boolean checkPassenger(Passenger passenger) {
        return passenger.isHaveTicket();
    }

    public static void addPassenger(PassengerCarriage passengerCarriage, Passenger passenger) {
        if(!checkPassenger(passenger)) {
            throw new IllegalArgumentException("passenger have not a ticket");
        }

        if(passengerCarriage.getMaxNumberOfPassengers() - passengerCarriage.getNumberOfPassengers() < 1) {
            throw new IllegalArgumentException("there are no seats in this carriage");
        }

        passengerCarriage.getPassengers().add(passenger);
        passengerCarriage.setNumberOfPassengers();
    }
}
