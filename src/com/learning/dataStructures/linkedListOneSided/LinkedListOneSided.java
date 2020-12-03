package com.learning.dataStructures.linkedListOneSided;

import org.jetbrains.annotations.NotNull;

public class LinkedListOneSided<T> {
    private final Info<T> info = new Info<>();

    public void push(T data) {
        Node<T> node = new Node<>(data);
        // Empty list
        if (this.isEmpty()) {
            this.info.setHead(node);
        } else {
            this.info.getTail().setNext(node);
        }
        this.info.setTail(node);
    }

    public T pop() {
        Node<T> node = info.getHead();
        if (!isEmpty()) {
            while (!node.getNext().equals(info.getTail())) {
                node = node.getNext();
            }
            T data = node.getNext().getData();
            info.setTail(node);
            node.setNext(null);
            return data;
        }
        return null;
    }

    public boolean isEmpty() {
        return this.info.getHead() == null;
    }

    public void add(@NotNull LinkedListOneSided<T> list) {
        if (!isEmpty()) {
            Node<T> nodeToAdd = list.info.getHead();
            this.info.getTail().setNext(nodeToAdd);
        } else {
            this.info.setHead(list.info.getHead());
        }
        this.info.setTail(list.info.getTail());

    }

    public void subtract(@NotNull LinkedListOneSided<T> listToSubtract) {
        Node<T> node = listToSubtract.info.getHead();
        while (node != null) {
            remove(node.getData());
            node = node.getNext();
        }
    }

    public void remove(int index) {
        Node<T> node = info.getHead();
        Node<T> nodeBefore = null;
        for (int i = 0; i <= index; i++) {
            if (node == null) {
                break;
            }
            if (i == index) {
                remove(node, nodeBefore);
                return;
            }
            nodeBefore = node;
            node = node.getNext();
        }
    }

    public void remove(Node<T> node, Node<T> nodeBefore) {
        if (nodeBefore != null) {
            nodeBefore.setNext(node.getNext());
            // if it is last element we also have to set new tail
            if (node.getNext() == null) {
                this.info.setTail(nodeBefore);
            }
        }
        // if it is first element
        else {
            if (isEmpty()) {
                info.setHead(null);
                info.setTail(null);
            } else {
                info.setHead(node.getNext());
            }
        }
    }

    public T get(int index) {
        Node<T> node = info.getHead();
        for (int i = 0; i <= index; i++) {
            if (node == null) {
                break;
            }
            if (i == index) {
                return node.getData();
            }
            node = node.getNext();
        }
        return null;
    }

    public void remove(T t) {
        Node<T> node = this.info.getHead();
        Node<T> nodeBefore = null;
        while (node != null) {
            if (node.getData().equals(t)) {
                remove(node, nodeBefore);
                return;

            }
            nodeBefore = node;
            node = node.getNext();
        }
    }

    public boolean has(T t) {
        Node<T> node = this.info.getHead();
        while (node != null) {
            if (node.getData().equals(t)) {
                return true;
            }
            node = node.getNext();
        }
        return false;
    }

    @Override
    public String toString() {
        if (this.isEmpty()) {
            return "LinkedListOneSided: " + "empty";
        }
        String head = "\nHead: \n" + (this.info.getHead() != null ? this.info.getHead() : "null") + "\n";
        String tail = "\nTail: \n" + (this.info.getTail() != null ? this.info.getTail() : "null") + "\n";
        StringBuilder nodes = new StringBuilder("\nNodes: \n");
        Node<T> node = this.info.getHead();
        while (node != null) {
            nodes.append(node);
            node = node.getNext();
        }
        return "LinkedListOneSided:\n" + head + tail + nodes;
    }
}