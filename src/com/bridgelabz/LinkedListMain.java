package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(56);
        list.add(30);
        list.add(70);
        list.display();
        list.search(30);
        if (list.search(30) == null)
            System.out.println("\nData Not Found in the Linked List");
        else
            System.out.println("\nData Found in the Linked List");
    }
}
