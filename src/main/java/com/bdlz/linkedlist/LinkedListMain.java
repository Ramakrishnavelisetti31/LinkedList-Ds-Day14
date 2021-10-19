package com.bdlz.linkedlist;

import java.util.Scanner;

public class LinkedListMain {
    public static void main(String[] args) {
        Operation operation = new Operation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to add the data at the start\n" + "Enter 2 to add the data at the end\n" +
                "Enter 3 to add the data at middle\n" + "Enter 4 to delete the first element\n" +
                "Enter 5 to delete the last element\n" + "Enter 6 to find index number and node based on value\n" +
                "Enter 7 to insert data at given node\n" + "Enter 8 to delete  after data after given node\n");
        switch (scanner.nextInt()) {
            case 1:
                operation.addDataAtStart();
                break;
            case 2:
                operation.addDataAtEnd();
                break;
            case 3:
                operation.addDataAtMiddle();
                break;
            case 4:
                operation.deleteFirstNode();
                break;
            case 5:
                operation.deleteLastNode();
                break;
            case 6:
                operation.findNodeBasedOnValue();
                break;
            case 7:
                operation.insertDataAtGivenNode();
                break;
            case 8:
                operation.deleteAfterNodeAfterSearchNode();
                break;
        }
        scanner.close();
    }
}
