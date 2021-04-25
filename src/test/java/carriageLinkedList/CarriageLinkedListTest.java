package carriageLinkedList;

import TestData.CarriageData;
import domain.train.carriage.CargoCarriage;
import domain.train.carriage.Carriage;
import domain.train.carriage.Locomotive;
import domain.train.carriage.PassengerCarriage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class CarriageLinkedListTest {

    private CarriageLinkedList linkedList;
    private List<Carriage> carriageList;

    @BeforeEach
    public void before() {
        carriageList = new ArrayList<>();

        Locomotive locomotive = CarriageData.anyValidLocomotive();
        PassengerCarriage passengerCarriage = CarriageData.anyValidPassengerCarriage();
        CargoCarriage cargoCarriage = CarriageData.anyValidCargoCarriage();

        carriageList.add(locomotive);
        carriageList.add(passengerCarriage);
        carriageList.add(cargoCarriage);

    }

    @Test
    void testContains() {
        linkedList = new CarriageLinkedList();
        linkedList.add(carriageList.get(0));
        linkedList.add(carriageList.get(1));
        linkedList.add(carriageList.get(2));

        Assertions.assertTrue(linkedList.contains(carriageList.get(0)));
        Assertions.assertTrue(linkedList.contains(carriageList.get(1)));
        Assertions.assertTrue(linkedList.contains(carriageList.get(2)));
    }

    @Test
    void testRemoveFirst() {
        linkedList = new CarriageLinkedList();
        linkedList.add(carriageList.get(0));
        linkedList.add(carriageList.get(1));
        linkedList.add(carriageList.get(2));

        Assertions.assertTrue(linkedList.remove(carriageList.get(0)));
        Assertions.assertFalse(linkedList.contains(carriageList.get(0)));
    }

    @Test
    void testRemoveLast() {
        linkedList = new CarriageLinkedList();
        linkedList.add(carriageList.get(0));
        linkedList.add(carriageList.get(1));
        linkedList.add(carriageList.get(2));

        Assertions.assertTrue(linkedList.remove(carriageList.get(2)));
        Assertions.assertFalse(linkedList.contains(carriageList.get(2)));
    }

    @Test
    void testRemove() {
        linkedList = new CarriageLinkedList();
        linkedList.add(carriageList.get(0));
        linkedList.add(carriageList.get(1));
        linkedList.add(carriageList.get(2));

        Assertions.assertTrue(linkedList.remove(carriageList.get(1)));
        Assertions.assertFalse(linkedList.contains(carriageList.get(1)));
    }
    
    @Test
    void testGetFirst() {
        linkedList = new CarriageLinkedList();
        linkedList.add(carriageList.get(0));
        linkedList.add(carriageList.get(1));
        linkedList.add(carriageList.get(2));

        Assertions.assertEquals(linkedList.getFirst(), carriageList.get(0));
    }

    @Test
    void testGetLast() {
        linkedList = new CarriageLinkedList();
        linkedList.add(carriageList.get(0));
        linkedList.add(carriageList.get(1));
        linkedList.add(carriageList.get(2));

        Assertions.assertEquals( linkedList.getLast(), carriageList.get(2));
    }

    @Test
    void testSize() {
        linkedList = new CarriageLinkedList();

        linkedList.add(carriageList.get(0));
        Assertions.assertEquals( linkedList.size(), 1);

        linkedList.add(carriageList.get(1));
        Assertions.assertEquals( linkedList.size(), 2);

        linkedList.add(carriageList.get(2));
        Assertions.assertEquals( linkedList.size(), 3);

    }
}