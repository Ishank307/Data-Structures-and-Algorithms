package linkedList;

/*Definition of singly linked list:
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
 */

class AddOne2LL {
    public ListNode addOne(ListNode head) {

        ListNode temp=head;
        ListNode temp1=head;
        int num=0;
        int count=10;
        while(temp!=null){
            num+={temp.val};
            temp=temp.next;
            count*=10;
        }

        int num1=Integer.parseInt(temp)+1;


        while(temp1!=null){
            temp.val=num1/count;
            temp1=temp1.next;
            count=count/10;
        }

        return head;
    }
}
