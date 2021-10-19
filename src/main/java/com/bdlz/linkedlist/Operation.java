package com.bdlz.linkedlist;

public class Operation {
    LinkedList linkedList = new LinkedList();
    public void addDataAtStart(){
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.print();
    }

    public void addDataAtEnd() {
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        linkedList.print();
    }

    public void addDataAtMiddle() {
        Node secondNode = linkedList.push(70);
        Node firstNode = linkedList.push(56);
        Node newNode = new Node(30);
        linkedList.print();
        System.out.println("");
        linkedList.insertInBetween(firstNode, newNode);
        linkedList.print();
    }

    public void deleteFirstNode() {
        addDataAtStart();
        System.out.println("");
        Node deleteNode = linkedList.pop();
        linkedList.print();
    }

    public void deleteLastNode() {
        addDataAtStart();
        System.out.println("");
        linkedList.popLast();
        linkedList.print();

    }

    public void findNodeBasedOnValue() {
        addDataAtStart();
        linkedList.findNode(30);
    }

    public void insertDataAtGivenNode() {
        addDataAtStart();
        Node newNode = new Node(40);
        Node previousNode = linkedList.searchNodeAt(30, newNode);
        System.out.println("Before");
        linkedList.print();
    }

    public void deleteAfterNodeAfterSearchNode() {
        System.out.println("Before");
        insertDataAtGivenNode();
        System.out.println("after");
        linkedList.deleteANode(40);
        linkedList.print();
    }
}
