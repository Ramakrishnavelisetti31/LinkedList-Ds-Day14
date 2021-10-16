package com.bdlz.linkedlist;

public class Operation {
    public static void addDataAtStart(){
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.print();
    }
    public static void addDataAtEnd() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        linkedList.print();
    }
}
