package domain.train.carriage;

import domain.user.Age;
import domain.user.Passenger;
import domain.user.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerCarriageTest {

    private PassengerCarriage passengerCarriage;

    @Test
    void addPassengerTest() {
        passengerCarriage = new PassengerCarriage(10);
        Passenger passenger = new Passenger(true, new User("Vlad", "Dudnitskiy", Age.of(20)));
        passengerCarriage.addPassenger(passenger);
        assertEquals(passengerCarriage.getNumberOfPassengers(), 1);
    }

    @Test
    void addPassengerWithoutTicket() {
        passengerCarriage = new PassengerCarriage(10);
        Passenger passenger = new Passenger(false, new User("Vlad", "Dudnitskiy", Age.of(20)));
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            passengerCarriage.addPassenger(passenger);
        });

        assertTrue(exception.getMessage().contains("passenger have not a ticket"));
    }

    @Test
    void addPassengerWithoutSeats() {
        passengerCarriage = new PassengerCarriage(0);
        Passenger passenger = new Passenger(true, new User("Vlad", "Dudnitskiy", Age.of(20)));
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            passengerCarriage.addPassenger(passenger);
        });

        assertTrue(exception.getMessage().contains("there are no seats in this carriage"));

    }
}