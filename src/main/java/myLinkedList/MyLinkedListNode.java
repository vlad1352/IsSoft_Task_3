package myLinkedList;

import domain.train.carriage.Carriage;

public class MyLinkedListNode {
    
    private Carriage value;
    private MyLinkedListNode next;
    
    public MyLinkedListNode(Carriage value) {
        this.value = value;
    }

    public MyLinkedListNode(MyLinkedListNode next) {
        this.next = next;
    }

    public MyLinkedListNode(Carriage value, MyLinkedListNode next) {
        this.value = value;
        this.next = next;
    }

    public Carriage getValue() {
        return value;
    }

    public void setValue(Carriage value) {
        this.value = value;
    }

    public MyLinkedListNode getNext() {
        return next;
    }

    public void setNext(MyLinkedListNode next) {
        this.next = next;
    }
}
