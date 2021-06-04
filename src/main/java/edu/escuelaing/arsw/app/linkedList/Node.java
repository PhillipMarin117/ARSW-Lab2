package edu.escuelaing.arsw.app.linkedList;

/**
 * Nodos utilizados por las Linked List
 */
public class Node <E>{
    E data;
    Node<E> next;

    public Node (E d){
        data = d;
        next = null;
    }
    public  Node(E d, Node<E> next){
        data = d;
        next = null;
    }
}
