package domain.train.carriage;

import domain.user.Driver;

public class Locomotive extends Carriage {

    private Driver driver;
    CarriageUtils carriageUtils = new CarriageUtils();

    public Locomotive(Driver driver) {
        carriageUtils.addDriver(this, driver);
        super.setNumber(0);
    }

    public Locomotive(Driver driver, long number) {
        carriageUtils.addDriver(this, driver);
        super.setNumber(number);
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
