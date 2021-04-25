package domain.train.carriage;

import domain.cargo.Cargo;
import domain.user.Age;
import domain.user.Driver;
import domain.user.Passenger;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarriageUtilsTest {

    private Locomotive locomotive;
    private CargoCarriage cargoCarriage;
    private PassengerCarriage passengerCarriage;

    @Test
    void addCargoTest() {
        cargoCarriage = new CargoCarriage(40);
        Cargo cargo = new Cargo(123, 38, "cargo 1");
        CarriageUtils.addCargo(cargo, cargoCarriage);

        assertEquals(cargoCarriage.getCargosList().size(), 1);
        Cargo cargo2 = new Cargo(123, 2, "cargo 2");
        CarriageUtils.addCargo(cargo2, cargoCarriage);
    }

    @Test
    void addCargoOverloadTest() {
        cargoCarriage = new CargoCarriage(40);
        Cargo cargo = new Cargo(123, 50, "cargo 1");
        try {
            CarriageUtils.addCargo(cargo, cargoCarriage);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertNotEquals("", e.getMessage());
        }
    }

    @Test
    void addDriverTest() {
        locomotive = new Locomotive();
        Driver driver = new Driver("Vlad", "Dudnitskiy", Age.of(20), true);
        CarriageUtils.addDriver(locomotive, driver);
        assertEquals(locomotive.getDriver(), driver);
    }

    @Test
    void addInvalidDriverTest() {
        locomotive = new Locomotive();
        Driver driver = new Driver("Vlad", "Dudnitskiy", Age.of(20), false);

        try {
            CarriageUtils.addDriver(locomotive, driver);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertNotEquals("", e.getMessage());
        }
    }

    @Test
    void addPassengerTest() {
        passengerCarriage = new PassengerCarriage(10);
        Passenger passenger = new Passenger("Vlad", "Dudnitskiy", Age.of(20), true);
        CarriageUtils.addPassenger(passengerCarriage, passenger);
        assertEquals(passengerCarriage.getNumberOfPassengers(), 1);
    }

    @Test
    void addPassengerWithoutTicket() {
        passengerCarriage = new PassengerCarriage(10);
        Passenger passenger = new Passenger("Vlad", "Dudnitskiy", Age.of(20), false);
        try {
            CarriageUtils.addPassenger(passengerCarriage, passenger);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("passenger have not a ticket", e.getMessage());
        }
    }

    @Test
    void addPassengerWithoutSeats() {
        passengerCarriage = new PassengerCarriage(0);
        Passenger passenger = new Passenger("Vlad", "Dudnitskiy", Age.of(20), true);
        try {
            CarriageUtils.addPassenger(passengerCarriage, passenger);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("there are no seats in this carriage", e.getMessage());
        }
    }
}