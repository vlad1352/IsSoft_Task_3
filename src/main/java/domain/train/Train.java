package domain.train;

import domain.train.carriage.Carriage;
import domain.train.carriage.Locomotive;
import carriageLinkedList.CarriageLinkedList;
import org.apache.log4j.Logger;

import java.util.*;

public class Train {

    private final String number;
    private Locomotive locomotive;
    private CarriageLinkedList train;

    private static final Logger logger = Logger.getLogger(Train.class);

    public Train(Locomotive locomotive, String number) {
        this.number = number;
        this.locomotive = locomotive;
        train = new CarriageLinkedList();
        train.add(locomotive);
    }

    public void addCarriage(Carriage carriage) {
        train.add(carriage);
        logger.info(String.format("%s = %s added to train", carriage.getClass(), carriage.getNumber()));
    }

    public void addCarriages(List<Carriage> carriages) {
        for (Carriage carriage : carriages) {
            train.add(carriage);
            logger.info(String.format("%s = %s added to train", carriage.getClass(), carriage.getNumber()));
        }
    }

    public void dropCarriage(Carriage carriage) {
        if(!train.remove(carriage)) {
            throw new IllegalArgumentException("there is no such carriage on the train");
        }
        logger.info(String.format("%s = %s dropped from train", carriage.getClass(), carriage.getNumber()));

    }

    public void dropCarriages(List<Carriage> carriages) {
        for(Carriage carriage : carriages) {
            if(!train.remove(carriage)) {
                throw new IllegalArgumentException("there is no such carriage on the train");
            }
            logger.info(String.format("%s = %s dropped from train", carriage.getClass(), carriage.getNumber()));

        }
    }

    public String getNumber() {
        return number;
    }

    public Locomotive getLocomotive() {
        return locomotive;
    }

    public void setLocomotive(Locomotive locomotive) {
        this.locomotive = locomotive;
    }

    public CarriageLinkedList getTrain() {
        return train;
    }

    public void setTrain(CarriageLinkedList train) {
        this.train = train;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return Objects.equals(number, train.number) && Objects.equals(locomotive, train.locomotive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, locomotive);
    }

    @Override
    public String toString() {
        return String.format("Train{number = %s, locomotive = %s}",
                number, locomotive.getNumber());
    }
}
