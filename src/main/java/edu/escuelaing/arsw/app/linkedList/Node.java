package edu.escuelaing.arsw.app.linkedList;

/**
 * Nodos utilizados por las Linked List
 */
public class Node {

	Node next;
	Node head;
	double data;
	public Node(double datos) {
		this.data = datos;
	}

	/**
	 * Agregue un nuevo nodo en el siguiente atributo
	 * @param data
	 */
	public void append(int data) {
		Node actual = this;
		while (actual.next != null) {
			actual = actual.next;
		}
		actual.next = new Node(data);
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
