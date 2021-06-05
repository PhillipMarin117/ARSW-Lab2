package edu.escuelaing.arsw.app.linkedList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/**
 * Las listas enlazadas son una representacion  dela classe de Java LinkedList.
 */
public class LinkedList{
    private Node head;
    private int size;

    public LinkedList() {
        size = 0;
    }


    /**
     * @param index
     * @return
     */
    public Node get(int index) {
        if (index < size()) {
            Node auxiliar = head;
            int cont = 0;
            while (auxiliar != null) {
                if (cont == index) {
                    return auxiliar;
                }
                auxiliar = auxiliar.next;
                cont++;
            }
        }
        return null;
    }
    /**
     * Add a new element to the list in last position
     * @param element
     */
    public void add(double element) {
        if (head != null) {
            Node actual = head;
            while (actual.next != null) {
                actual = actual.next;

            }
            actual.next = new Node(element);
            actual.next.head = actual;

        }
        else {
            head = new Node(element);
            head.head = null;
        }
        incrementar();
    }

    /**
     * @param datos
     */
    public void remove(double datos) {
        if (head == null) {
            return;
        }
        if (head.datos == datos) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.datos == datos) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    /**
     * removes the last element on linkedlist if it's not empty
     */
    public void remove() {
        if (head != null) {
            Node actual = head;
            while (actual.next != null) {
                actual = actual.next;

            }
            actual = null;
        }
        disminuir();
    }

    public int size() {
        return size;
    }

    /**
     * Gets linkedlist's head.
     * @return head
     */
    public Node getHead() {
        return head;
    }

    /**
     * Incrementa el tamaño de la linkedlist
     */
    private void incrementar() {
        size++;
    }

    /**
     * Disminuye el tamaño de la linkedlist
     */
    private void disminuir() {
        size--;
    }


}

