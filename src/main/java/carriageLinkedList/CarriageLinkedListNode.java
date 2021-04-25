package carriageLinkedList;

import domain.train.carriage.Carriage;

public class CarriageLinkedListNode {
    
    private Carriage value;
    private CarriageLinkedListNode next;
    
    public CarriageLinkedListNode(Carriage value) {
        this.value = value;
    }

    public CarriageLinkedListNode(CarriageLinkedListNode next) {
        this.next = next;
    }

    public CarriageLinkedListNode(Carriage value, CarriageLinkedListNode next) {
        this.value = value;
        this.next = next;
    }

    public Carriage getValue() {
        return value;
    }

    public void setValue(Carriage value) {
        this.value = value;
    }

    public CarriageLinkedListNode getNext() {
        return next;
    }

    public void setNext(CarriageLinkedListNode next) {
        this.next = next;
    }
}
