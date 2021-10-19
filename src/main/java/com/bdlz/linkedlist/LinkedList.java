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

    public void  popLast () {
        Node temp = head;
        while (!temp.next.equals(tail)) {
            temp = temp.next;
        }
        this.tail = temp;
        temp.next = null;
    }

    public void findNode(int value) {
        Node tempNode = head;
        int index = 1;
        boolean flag = false;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            while (tempNode != null) {
                if (tempNode.data ==  value) {
                    flag = true;
                    break;
                }
                index++;
                tempNode = tempNode.next;
            }
        }
        if (flag == true) {
            System.out.println("Value:" + value + " is present at Index:" + index);
        } else {
            System.out.println("Element no present");
        }
    }

    public Node searchNodeAt(int value, Node newNode) {
        Node tempNode = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            while (tempNode != null) {
                if (tempNode.data == value) {
                    break;
                }
                tempNode = tempNode.next;

            } Node tempNodeNext = tempNode.next;
            tempNode.next = newNode;
            newNode.next = tempNodeNext;
        }
        return tempNode;
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

