package linked;

import java.util.*;

public class LL {
    // class Node {
    // String data;
    // Node next;

    // Node(String data) {
    // this.data = data;
    // this.next = null;
    // }
    // }

    // Node head;
    // private int size;

    // LL() {
    // this.size = 0;
    // }

    // // add first
    // public void addFirst(String data) {
    // Node newNode = new Node(data);
    // if (head == null) {
    // head = newNode;
    // size++;
    // return;
    // }
    // newNode.next = head;
    // head = newNode;
    // size++;
    // }

    // // add last
    // public void addLast(String data) {
    // Node newNode = new Node(data);
    // if (head == null) {
    // head = newNode;
    // size++;
    // return;
    // }
    // Node currNode = head;
    // while (currNode.next != null) {
    // currNode = currNode.next;
    // }
    // currNode.next = newNode;
    // size++;
    // }

    // // print list
    // public void printList() {
    // if (head == null) {
    // System.out.println("List is empty");
    // return;
    // }
    // Node currNode = head;
    // while (currNode != null) {
    // System.out.print(currNode.data + " -> ");
    // currNode = currNode.next;
    // }
    // System.out.println("null");
    // }

    // // Delete first
    // public void deleteFirst() {
    // if (head == null) {
    // System.out.println("List is empty");
    // return;
    // }
    // head = head.next;
    // size--;
    // }

    // // Delete last
    // public void deleteLast() {
    // if (head == null) {
    // System.out.println("List is empty");
    // return;
    // }
    // if (head.next == null) {
    // head = null;
    // size--;
    // return;
    // }
    // Node secondLast = head;
    // Node lastNode = head.next;
    // while (lastNode.next != null) {
    // lastNode = lastNode.next;
    // secondLast = secondLast.next;
    // }
    // secondLast.next = null;
    // size--;
    // }

    // public int getSize() {
    // return size;
    // }

    public static void main(String[] args) {
        // LL list = new LL();
        // list.addFirst("a");
        // list.addFirst("is");
        // list.printList();

        // list.addLast("list");
        // list.printList();

        // list.addFirst("this");
        // list.printList();

        // list.deleteFirst();
        // list.printList();

        // list.deleteLast();
        // list.printList();
        // System.out.println("Size of the list: " + list.getSize());

        LinkedList<String> list = new LinkedList<>();

        list.addFirst("a");
        list.addFirst("is");

        System.out.println(list);

        list.addFirst("This");
        list.addLast("list");
        System.out.println(list);

        System.out.println("Size of the list: " + list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");

        list.removeFirst();
        list.removeLast();

        System.out.println(list);

    }
}
