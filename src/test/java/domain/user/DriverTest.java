package domain.user;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DriverTest {

    @Test
    public void isHaveLicence() {
        Driver driver = new Driver("Vlad", "Dudnitskiy", Age.of(20), true);
        assertTrue(driver.isHaveLicence());
        driver.setHaveLicence(false);
        assertFalse(driver.isHaveLicence());
    }

}