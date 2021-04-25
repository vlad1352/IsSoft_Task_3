package domain.train.carriage;

import domain.user.Age;
import domain.user.Driver;
import domain.user.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocomotiveTest {
    private Locomotive locomotive;

    @Test
    void addDriverTest() {
        locomotive = new Locomotive();
        Driver driver = new Driver(true, new User("Vlad", "Dudnitskiy", Age.of(20)));
        locomotive.addDriver(driver);
        assertEquals(locomotive.getDriver(), driver);
    }

    @Test
    void addInvalidDriverTest() {
        locomotive = new Locomotive();
        Driver driver = new Driver(false, new User("Vlad", "Dudnitskiy", Age.of(20)));

        assertThrows(IllegalArgumentException.class, () -> {
            locomotive.addDriver(driver);
        });
    }


}