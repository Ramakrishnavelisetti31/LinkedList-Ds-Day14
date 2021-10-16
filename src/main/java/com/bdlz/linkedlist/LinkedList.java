package com.bdlz.linkedlist;

public class LinkedList {
    Node head;
    Node tail;

    public Node push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;
            this.head = newNode;
            newNode.next = temp;
        }
        return newNode;
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

    public void insertInBetween(Node previousNode ,Node newNode){
        Node temp = previousNode.next;
        previousNode.next = newNode;
        newNode.next = temp;
    }

    public Node pop() {
        Node temp = this.head;
        this.head = this.head.next;
        return temp;
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
                } else {
                    System.out.print(temp.data + " -> ");
                    temp = temp.next;
                }
            }
        }
    }
}

