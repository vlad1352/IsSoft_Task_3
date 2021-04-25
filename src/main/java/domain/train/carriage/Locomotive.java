package domain.train.carriage;

import domain.user.Driver;

import java.util.UUID;

public class Locomotive extends Carriage {

    private Driver driver;

    public Locomotive() {
    }

    public Locomotive(Driver driver) {
        addDriver(driver);
        super.setNumber(UUID.randomUUID().toString());
    }

    public void addDriver(Driver driver) {
        if(driver.getUser().getAge().intValue() >= 18 && driver.isHaveLicence()) {
            this.driver = driver;
        } else {
            throw new IllegalArgumentException("driver must be over 18 years and has license");
        }
    }

    public Locomotive(Driver driver, String number) {
        addDriver(driver);
        super.setNumber(number);
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

}
