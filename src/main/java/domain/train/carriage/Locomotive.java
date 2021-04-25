package domain.train.carriage;

import domain.user.Driver;

import java.util.UUID;

public class Locomotive extends Carriage {

    private Driver driver;

    public Locomotive() {
    }

    public Locomotive(Driver driver) {
        CarriageUtils.addDriver(this, driver);
        super.setNumber(UUID.randomUUID().toString());
    }

    public Locomotive(Driver driver, String number) {
        CarriageUtils.addDriver(this, driver);
        super.setNumber(number);
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

}
