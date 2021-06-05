package edu.escuelaing.arsw.app.linkedList;

/**
 * Nodos utilizados por las Linked List
 */
public class Node {
    Node next;
    Node head;
    double datos;
    public Node(double datos) {
        /**
         * Add a new Node in the next attribute
         * @param datos
         */
    }
        public void append(int datos){
            Node current = this;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(datos);
        }

        public Node getHead() {
            return head;
        }

        public double getDatos() {
            return datos;
        }

        public Node getNext() {
            return next;
        }
}
