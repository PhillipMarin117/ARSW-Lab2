package edu.escuelaing.arsw.app.linkedList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/**
 * Las listas enlazadas son una representacion  dela classe de Java LinkedList.
 */
public class LinkedList<E> implements List<E>{
    int size;
    Node <E> first;
    Node <E> last;

    public LinkedList(){
        size = 0;
        first = null;
        last = null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node<E> current = first;

            public boolean hasNext() {
                return current != null;
            }
            public E next() {
                if (hasNext()){
                    E data = current.data;
                    current = current.next;
                }
                return null;
            }
            public void remove (){
                throw new UnsupportedOperationException("Remove not implemented.");
            }
        };
    }
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (E item : this) {
            s.append(item + " ");
        }
        return s.toString();
    }
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    /**
     * Permite agregar un objeto de cualquier Tipo a la lista
     *
     * @param e item dato a agregar.
     */
    public boolean add(E item) {
        if (!isEmpty()){
            Node<E> prev = last;
            last = new Node<E>(item, null);
            prev.next = last;
        }
        else{
            last = new Node<E>(item, null);
            first = last;
        }
        size++;
        return true;
    }

    public boolean remove(Object item) {
        boolean result = false;
        Node<E> prev = first;
        Node<E> curr = first;
        while (curr.next != null || curr == last){
            if(curr.data.equals(item)){
                //Elimina el unico elemento dentro de esta lista
                if(size ==1){
                    first = null;
                    last = null;
                }
                //Eliminará el primer elemento
                else if (curr.equals(first)){
                    first = first.next;
                }
                //Eliminará el ultimo elemento
                else if( curr.equals(last)){
                    last = prev;
                    last.next = null;
                }
                //Eliminará el elemento
                else{
                    prev.next = curr.next;
                }
                size --;
                result =true;
                break;
            }
            prev = curr;
            curr = prev.next;
        }
        return result;
    }

    public boolean containsAll(Collection<?> c) {
        return false;
    }

    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void clear() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E get(int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E set(int index, E element) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void add(int index, E element) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public E remove(int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ListIterator<E> listIterator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ListIterator<E> listIterator(int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<E> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
