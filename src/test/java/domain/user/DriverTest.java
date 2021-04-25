package domain.user;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DriverTest {

    @Test
    public void isHaveLicence() {
        Driver driver = new Driver(true, new User("Vlad", "Dudnitskiy", Age.of(20)));
        assertTrue(driver.isHaveLicence());
        driver.setHaveLicence(false);
        assertFalse(driver.isHaveLicence());
    }

}