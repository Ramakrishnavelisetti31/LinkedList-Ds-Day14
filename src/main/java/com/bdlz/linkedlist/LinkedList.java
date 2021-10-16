package com.bdlz.linkedlist;

public class LinkedList {
    Node head;
    Node tail;

    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;
            this.head = newNode;
            newNode.next = temp;
        }
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = tail;
            this.tail = newNode;
            temp.next = newNode;
        }
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked List is Empty");
        } else {
            Node temp = head;
            while (temp != null) {
                if (temp.next != null) {
                    System.out.print(temp.data + " -> ");
                    temp = temp.next;
                } else
                    System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
        }
    }
}

