package org.example;

public class Main {

    // 1. Реализовать методы в MyLinkedList, которые не успели в классе.
    // pushToTail(int data),
    // pushToIndex(int index, int data)
    // removeLast(),
    // remove(int index)
    // get(int index)

    Node head;

    public void print() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public void pushToTail(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = new Node(data);
        }
    }

    public void pushToIndex(int index, int data) {
        if (index < 0) {
            System.out.println("The index can not be negative");
        } else if (index == 0) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        } else {
            Node currentNode = head;
            for (int i = 0; i < index - 1; i++) {
                if (currentNode == null) {
                    System.out.println("The index is out of range");
                    return;
                }
                currentNode = currentNode.next;
            }
            Node newNode = new Node(data);
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
    }

    public void removeLast(){
        if (head==null) System.out.println("The linked list is empty");
        else if (head.next==null) head=null;
        else {
            Node currentNode = head;
            while(currentNode.next.next !=null){
                currentNode = currentNode.next;
            }
            currentNode.next = null;
        }
    }


    public void remove (int index){
        if (index<0) System.out.println("the index can not be negative");
        else if (index==0){
            if (head==null) System.out.println("The linked list is empty");
            else head = head.next;
        }
        else {
            Node currentNode = head;
            for (int i=0;i<index-1;i++){
                if (currentNode==null){
                    System.out.println("the index is out of bounds");
                    return;
                }
                currentNode = currentNode.next;
            }
            currentNode.next = currentNode.next.next;
        }
    }

    public void get(int index){
        if (index<0){
            System.out.println("the index can't be negative");
        }
        else if (index==0){
            if (head==null) System.out.println("the linked list is empty");
            else System.out.println(head.data);
        }
        else {
            Node currentNode = head;
            for (int i=0;i<index;i++){
                if (currentNode==null){
                    System.out.println("The index is out of the range");
                }
                currentNode = currentNode.next;
            }
            System.out.println(currentNode.data);
        }
    }



    public static void main(String[] args) {

        Main mainList = new Main();

        mainList.pushToTail(100);
        mainList.pushToTail(200);
        mainList.pushToTail(300);
        mainList.pushToTail(400);
        mainList.pushToIndex(1, 555);
        mainList.removeLast();
        mainList.print();   // 100->555->200->300->null
        mainList.remove(1);
        mainList.print();   //  100->200->300->null
        mainList.get(2);   // 300
    }


    }