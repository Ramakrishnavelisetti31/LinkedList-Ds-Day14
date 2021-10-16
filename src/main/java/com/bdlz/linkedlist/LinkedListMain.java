package com.bdlz.linkedlist;

import java.util.Scanner;

public class LinkedListMain {
    public static void main(String[] args) {
        Operation operation = new Operation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to add the data at the start\n" + "Enter 2 to add the data at the end\n" +
                            "Enter 3 to add the data at middle");
        switch(scanner.nextInt()) {
            case 1:
                operation.addDataAtStart();
                break;
            case 2:
                operation.addDataAtEnd();
                break;
            case 3:
                operation.addDataAtMiddle();
                break;
        }
        scanner.close();
    }
}
