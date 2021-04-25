package domain.user;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {
    @Test
    public void isHaveTicked() {
        Passenger passenger = new Passenger("Vlad", "Dudnitskiy", Age.of(20), true);
        assertTrue(passenger.isHaveTicket());
        passenger.setHaveTicket(false);
        assertFalse(passenger.isHaveTicket());
    }
}