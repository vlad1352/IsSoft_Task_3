package domain.train.carriage;

import domain.cargo.Cargo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class CargoCarriageTest {

    private CargoCarriage cargoCarriage;

    @Test
    void addCargoTest() {
        cargoCarriage = new CargoCarriage(40);
        Cargo cargo = new Cargo(123, 38, "cargo 1");
        cargoCarriage.addCargo(cargo);

        assertEquals(cargoCarriage.getCargosList().size(), 1);
        Cargo cargo2 = new Cargo(123, 2, "cargo 2");
        cargoCarriage.addCargo(cargo2);
    }

    @Test
    void addCargoOverloadTest() {
        cargoCarriage = new CargoCarriage(40);
        Cargo cargo = new Cargo(123, 50, "cargo 1");

        assertThrows(IllegalArgumentException.class, () -> {
            cargoCarriage.addCargo(cargo);
        });

    }

}