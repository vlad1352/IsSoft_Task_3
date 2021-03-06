package carriageLinkedList;

import domain.train.carriage.Carriage;
import domain.train.carriage.Locomotive;

public class CarriageLinkedList {

    private CarriageLinkedListNode head;
    private CarriageLinkedListNode tail;

    public CarriageLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(Carriage carriage) {
        if (head == null) {
            if (carriage.getClass().equals(Locomotive.class)) {
                head = new CarriageLinkedListNode(carriage, null);
                tail = head;
            } else {
                throw new IllegalArgumentException("locomotive must be the first");
            }
        } else {
            CarriageLinkedListNode ln = new CarriageLinkedListNode(carriage, null);
            tail.setNext(ln);
            tail = ln;
        }
    }

    public void clear() {
        throw new UnsupportedOperationException("not implemented yet");
    }

    public boolean remove(Carriage carriage) {
        if (head.getValue().equals(carriage)) {
            head = head.getNext();
            return true;
        }

        CarriageLinkedListNode curr = this.head;
        while (!curr.getNext().equals(this.tail)) {
            if (curr.getNext().getValue().equals(carriage)) {
                curr.setNext(curr.getNext().getNext());
                return true;
            }
            curr = curr.getNext();
        }


        if (tail.getValue().equals(carriage)) {
            curr = this.head;
            while (!curr.getNext().equals(this.tail)) {
                curr = curr.getNext();
            }
            this.tail = curr;
            tail.setNext(null);
            return true;
        }

        return false;
    }

    public boolean contains(Carriage carriage) {
        CarriageLinkedListNode curr = this.head;
        while (curr != null) {
            if (curr.getValue().equals(carriage)) {
                return true;
            }
            curr = curr.getNext();
        }
        return false;
    }

    public int size() {
        int size = 0;
        CarriageLinkedListNode curr = this.head;
        while (curr != null) {
            size++;
            curr = curr.getNext();
        }
        return size;
    }

    public Carriage getFirst() {
        return head.getValue();
    }

    public Carriage getLast() {
        return tail.getValue();
    }

}
