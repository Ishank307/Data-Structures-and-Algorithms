package linkedList;

public class Main {

    public static void main(String[] args) {
//        DoublyLinkedList list=new DoublyLinkedList();
//
//        list.insertFirst(2);
//        list.insertFirst(3);
//        list.insertFirst(5);
//        list.insertFirst(10);
//        list.insertLast(1000);
//
//        list.insert(10,34);
//        list.display();

//        CircularLinkedList list=new CircularLinkedList();
//        list.insert(23);
//        list.insert(42);
//        list.insert(43);
//        list.delete(42);
//        list.display();

        LL list=new LL();
        list.insertFirst(2);
        list.insertFirst(4);
        list.insertFirst(6);
        list.insertFirst(10);

        list.insertRecursion(8,1);
        list.display();

    }
}
