package Recursion.LinkedList_R;

public class Source {
    public static void main(String[] args) {
        CustomLinkedList_R vlist  = new CustomLinkedList_R();
        for (int i = 1; i <= 5; i++) {
            Node newNode = new Node(i);
            vlist.insertNodeEnd(vlist.head,newNode);
        }
      vlist.printNode(vlist.head);
    }
}
