package com.bdlz.linkedlist;

import java.util.Scanner;

public class LinkedListMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to add the data at the start\n" +
                            "Enter 2 to add the data at the end");
        switch(scanner.nextInt()) {
            case 1:
                Operation.addDataAtStart();
                break;
            case 2:
                Operation.addDataAtEnd();
                break;
        }
        scanner.close();
    }
}
