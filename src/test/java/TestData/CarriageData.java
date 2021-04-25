package TestData;

import domain.train.carriage.CargoCarriage;
import domain.train.carriage.Carriage;
import domain.train.carriage.Locomotive;
import domain.train.carriage.PassengerCarriage;
import domain.user.Age;
import domain.user.Driver;

import java.util.UUID;

public class CarriageData {

    public static Locomotive anyValidLocomotive() {

        return new Locomotive(new Driver("name", "lastname", Age.of(18),true));
    }

    public static PassengerCarriage anyValidPassengerCarriage() {
        return new PassengerCarriage(10);
    }

    public static CargoCarriage anyValidCargoCarriage() {
        return new CargoCarriage(10_000, UUID.randomUUID().toString());
    }
}
