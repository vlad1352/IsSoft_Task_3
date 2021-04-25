package domain.train;

import TestData.CarriageData;
import domain.train.carriage.CargoCarriage;
import domain.train.carriage.Carriage;
import domain.train.carriage.Locomotive;
import domain.train.carriage.PassengerCarriage;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class TrainTest {

    private Train train;

    @Test
    void addCarriageTest() {
        Locomotive locomotive = CarriageData.anyValidLocomotive();
        train = new Train(locomotive, UUID.randomUUID().toString());
        Carriage carriage = CarriageData.anyValidPassengerCarriage();
        train.addCarriage(carriage);
        assertEquals(train.getTrain().getLast(), carriage);
    }

    @Test
    void addCarriagesTest() {
        List<Carriage> carriageList = new ArrayList<>();

        Locomotive locomotive = CarriageData.anyValidLocomotive();
        PassengerCarriage passengerCarriage = CarriageData.anyValidPassengerCarriage();
        CargoCarriage cargoCarriage = CarriageData.anyValidCargoCarriage();

        carriageList.add(passengerCarriage);
        carriageList.add(cargoCarriage);
        train = new Train(locomotive, UUID.randomUUID().toString());
        train.addCarriages(carriageList);
        assertEquals(train.getTrain().size(), 3);
    }

    @Test
    void dropCarriageTest() {
        Locomotive locomotive = CarriageData.anyValidLocomotive();
        train = new Train(locomotive, UUID.randomUUID().toString());
        Carriage carriage = CarriageData.anyValidPassengerCarriage();
        train.addCarriage(carriage);
        train.dropCarriage(carriage);
        assertEquals(train.getTrain().size(), 1);
    }

    @Test
    void dropCarriagesTest() {
        List<Carriage> carriageList = new ArrayList<>();

        Locomotive locomotive = CarriageData.anyValidLocomotive();
        PassengerCarriage passengerCarriage = CarriageData.anyValidPassengerCarriage();
        CargoCarriage cargoCarriage = CarriageData.anyValidCargoCarriage();

        carriageList.add(passengerCarriage);
        carriageList.add(cargoCarriage);
        train = new Train(locomotive, UUID.randomUUID().toString());
        train.addCarriages(carriageList);
        train.dropCarriages(carriageList);
        assertEquals(train.getTrain().size(), 1);
    }
}