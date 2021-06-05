package edu.escuelaing.arsw.app.linkedList;

/**
 * Las listas enlazadas son una representacion  dela classe de Java LinkedList.
 */
public class LinkedList {

	private Node head;
	private int size;
	public LinkedList() {
		size = 0;
	}

	/**
	 * Agregar un nuevo elemento a la lista en la última posición
	 * @param elemento
	 */
	public void add(double elemento) {
		if (head != null) {
			Node actual = head;
			while (actual.next != null) {
				actual = actual.next;
			}
			actual.next = new Node(elemento);
			actual.next.head = actual;

		}
		else {
			head = new Node(elemento);
			head.head = null;
		}
		incrementa();
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
		disminuye();
	}

	/**
	 * Removes data element passed by parameter.
	 *
	 * @param data
	 */
	public void remove(double data) {
		Node actual = head;
		if (head == null)
			return;
		if (head.data == data) {
			head = head.next;
			return;
		}
		while (actual.next != null) {
			if (actual.next.data == data) {
				actual.next = actual.next.next;
				return;
			}
			actual = actual.next;
		}
	}


	/**
	 * Gets the node in index position.
	 *
	 * @param index
	 * @return
	 */
	public Node get(int index) {
		if (index < size()) {
			int cont = 0;
			Node aux = head;
			while (aux != null) {
				if (cont == index) {
					return aux;
				}
				aux = aux.next;
				cont++;
			}
		}
		return null;
	}

	/**
	 * retorna la cabeza de lalinkedlist.
	 * @return head
	 */
	public Node getHead() {
		return head;
	}

	public int size() {
		return size;
	}

	/**
	 * Incrementa el tamaño de la linkedlist
	 */
	private void incrementa() {
		size++;
	}

	/**
	 * Disminuye el tamaño de la linkedlist
	 */
	private void disminuye() {
		size--;
	}

}
