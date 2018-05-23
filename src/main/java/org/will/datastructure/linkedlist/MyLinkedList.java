package org.will.datastructure.linkedlist;

/**
 * ClassName:MyLinkedList
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年05月23日
 */
public class MyLinkedList <E> {
    Node<E> head = null;
    private class Node<E> {
        E e;
        Node<E> next;

        public Node(E e, Node<E> next) {
            this.e = e;
            this.next = next;
        }
    }
    public boolean add (E e) {
        Node<E> newNode = null;
        if (head == null) {
            newNode = new Node<E>(e, null);
            head = newNode;
        } else {
            newNode = new Node<E>(e, head);
            head = newNode;
        }
        return true;
    }
    public void displayAll() {
        while (head != null) {
            System.out.println(head.e);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
        myLinkedList.add("A");
        myLinkedList.add("B");
        myLinkedList.add("C");
        myLinkedList.add("D");
        myLinkedList.displayAll();
    }
}
