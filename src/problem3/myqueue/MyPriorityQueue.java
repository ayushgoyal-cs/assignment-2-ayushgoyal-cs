/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.adt.ADT;
import problem3.node.Node;

import java.util.Queue;
public class MyPriorityQueue<E> implements ADT<E> {
    private int size = 0;
    private Node<E> front;
    private Node<E> rear;
    private Node<E> getNode(int index) {
        Node<E> response = front;
        if (index < 0 && index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else {
            for (int i = 1; i < index && front != null; i++) {
                response = response.getNext();
            }
        }
        return response;
    }
    private void sortedAdd(E data) {

    }

    @Override
    public void add(E data) {

    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }
}
