package edu.escuelaing.arsw.app.linkedList;

/**
 * Nodos utilizados por las Linked List
 */
public class Node {

    Node next;
    Node head;
    double data;

    public Node(double data) {
        this.data = data;
    }

    /**
     * Add a new Node in the next attribute
     * @param data
     */
    public void append(int data) {
        Node current = this;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public Node getHead() {
        return head;
    }

    public double getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

}
