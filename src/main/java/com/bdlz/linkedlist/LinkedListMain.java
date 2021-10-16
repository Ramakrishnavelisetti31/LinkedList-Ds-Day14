package com.bdlz.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {

        Node firstNode = new Node(56);
        Node secondNode = new Node(70);
        Node thirdNode = new Node(30);


        Node head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        Node tail = thirdNode;

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
