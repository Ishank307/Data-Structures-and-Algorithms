package linkedList;

//Representation of a node
class Node {
 int data;
 Node next;

 Node(int d) {
     data = d;
     next = null;
 }
}

class Solution {
 public Node arrayToList(int arr[]) {
     if (arr.length == 0) return null;  // edge case

     Node head = new Node(arr[0]); // initializing first node
     Node current = head;

     for (int i = 1; i < arr.length; i++) {
         current.next = new Node(arr[i]);
         current = current.next;
     }

     return head;
 }
}

public class Initialization {
 public static void main(String[] args) {
     Solution ob = new Solution();
     int[] arr = {10, 20, 30, 40, 50};

     Node head = ob.arrayToList(arr);

     // Print the linked list
     printList(head);
 }

 public static void printList(Node head) {
     Node current = head;
     while (current != null) {
         System.out.print(current.data + " -> ");
         current = current.next;
     }
     System.out.println("null");
 }
}
