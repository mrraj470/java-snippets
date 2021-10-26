package com.interview.assessment.playground;

public class Main {

    public static void main(String[] args) {
        Node head = new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);

        Printer printer = new Printer();
        System.out.println("Out: " + printer.print(head));
    }

}
