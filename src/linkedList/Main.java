package linkedList;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList list=new DoublyLinkedList();

        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(10);
        list.insertLast(1000);

        list.insert(10,34);
        list.display();
    }
}
