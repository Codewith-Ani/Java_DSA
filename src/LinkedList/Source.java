package LinkedList;

public class Source {
    public static void main(String[] args) {
        Custom_LinkedList vLinkedList = new Custom_LinkedList();

        vLinkedList.insert_end(1);
        vLinkedList.insert_end(2);
        vLinkedList.insert_end(2);

        vLinkedList.insert_end(1);
        vLinkedList.insert_end(3);


        vLinkedList.printList(vLinkedList.head);
        System.out.println();
        boolean flag =  vLinkedList.isPalindrome(vLinkedList.head);

        if (flag)
            System.out.println("is Palindrome");
        else
            System.out.println("Linked-list is not Palindrome");
    }
}


/*
        head = vLinkedList.insert_afterLocation(3,1);

        head = vLinkedList.insert_beforeLocation(9,3);
        head = vLinkedList.insert_beforeSearchValue(33,1);
        head = vLinkedList.insert_afterSearchValue(25,6);


        vLinkedList.printList(head);
        head = vLinkedList.reverseLinkedList();
        System.out.println();
        Node middle = vLinkedList.findMiddle();
        System.out.println();
        System.out.println(middle.value);

        Node temp = vLinkedList.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = vLinkedList.head;


        vLinkedList.removeDuplicate(vLinkedList.head);
        System.out.println();

        vLinkedList.printList(vLinkedList.head);

*/

