package Recursion.LinkedList_R;

public class CustomLinkedList_R {
    Node head;
    public void insertNodeEnd(Node curr, Node newNode) {
        if(head == null) {
            head = newNode;
            return;
        }
        if(curr.next == null) {
            curr.next = newNode;
            return;
        }
        insertNodeEnd(curr.next,newNode);
    }

    public void reverseLinkedList(Node curr, Node prev) {
        if(curr.next == null) {
            head = curr;
            curr.next = prev;
            return;
        }
        Node nextPtr = curr.next;
        curr.next = prev;
        reverseLinkedList(nextPtr,curr);
    }



    /*
    void solve(Node start){
        if(start == null)
            return;
        System.out.print(start.value + " ");
        if(start.next != null)
            solve(start.next.next);
        System.out.print(start.value + " ");
    }
    */

    public void printNode(Node curr){
        if(curr == null) {
            return;
        }
        System.out.print(curr.value + " ");
        printNode(curr.next);
    }
}
