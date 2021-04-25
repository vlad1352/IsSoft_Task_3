package domain.user;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {
    @Test
    public void isHaveTicked() {
        Passenger passenger = new Passenger(true, new User("Vlad", "Dudnitskiy", Age.of(20)));
        assertTrue(passenger.isHaveTicket());
        passenger.setHaveTicket(false);
        assertFalse(passenger.isHaveTicket());
    }
}