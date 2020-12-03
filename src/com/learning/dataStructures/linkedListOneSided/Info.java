package com.learning.dataStructures.linkedListOneSided;

public class Info<T> {
    private Node<T> head;
    private Node<T> tail;

    public Info(Node<T> head, Node<T> tail) {
        this.head = head;
        this.tail = tail;
    }

    public Info(Node<T> head) {
        this.head = head;
    }

    public Info() {
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }
}
