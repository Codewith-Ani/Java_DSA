package LinkedList;

public class Custom_LinkedList {
    Node head;
    /*
     *  Insertion
     *      - Beginning
     *      - End
     *      - At any location
     *          - based on data
     *              - before data
     *              - after data
     *          - based on position
     *              - before position
     *              - after position
     */

    public  Node insert_beginning(int value) {
        Node newNode = new Node(value);
        if(head == null)
            return head = newNode;
        newNode.next = head;
        head = newNode;
        return head;
    }


    public Node insert_end(int value) {
        Node newNode = new Node(value);
        if (head == null)
            head = newNode;
        else {
            Node curr = head;
            while (curr.next != null)
                curr = curr.next;
            curr.next = newNode;
        }
        return head;
    }

    public Node insert_afterLocation(int value, int position) {
        Node newNode = new Node(value);
        if(position >= 0) {
            if(position == 0)
                insert_beginning(value);
            else {
                Node curr = head;
                int count = 0;
                while (curr.next != null && count < position) {
                    count++;
                    curr = curr.next;
                }
                if(curr.next == null && count < position)
                    System.out.println("Count of nodes less then position requested");
                else {
                    newNode.next = curr.next;
                    curr.next = newNode;
                }
            }
        }
        else
            System.out.println("Please provide a positive value for position");

        return head;
    }


    public Node insert_beforeLocation(int value, int before) {
        Node newNode = new Node(value);
        Node curr = head;
        int count = 0;
        while (curr != null) {
            count++;
            if(count + 1 == before) {
                newNode.next = curr.next;
                curr.next = newNode;
                break;
            }
            curr = curr.next;
        }
        return head;
    }

    public Node insert_beforeSearchValue(int value, int searchValue) {
        if(head == null)
            System.out.println("LinkedList not present");
        else {
            Node curr = head;
            if(head.value == searchValue) {
                insert_beginning(value);
            }
            else {
                Node newNode = new Node(value);
                while (curr.next != null) {
                    if (curr.next.value == searchValue) {
                        newNode.next = curr.next;
                        curr.next = newNode;
                        break;
                    }
                    curr = curr.next;
                }
            }
        }
        return head;
    }
    public  Node insert_afterSearchValue(int value, int searchValue) {
        if(head == null)
            System.out.println("LinkedList not present");
        else {
            Node curr = head;
            Node newNode = new Node(value);
            while (curr != null) {
                if (curr.value == searchValue) {
                        newNode.next = curr.next;
                        curr.next = newNode;
                        break;
                    }
                    curr = curr.next;
                }
            }
        return head;
    }
    public Node reverseLinkedList(Node head) {
        if(head == null)
            System.out.println("No Linked List present");
        else {
            Node curr = head;
            Node slow = null;
            Node fast = null;
            while (curr != null) {
                fast = curr.next;
                curr.next = slow;
                slow = curr;
                curr = fast;
            }
            head = slow;
        }
        return head;
    }

    public Node findMiddle() {
        Node fast = head;
        Node slow = head;

        if(head == null)
            System.out.println("There is no LinkedList available ");
        else {
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
        }
        return slow;
    }

    public Boolean detectLoop() {
        Node slow = head;
        Node fast = head;
        boolean flag = false;

        while (slow != null &&  fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public void removeDuplicate(Node head) {
        if(head == null)
            return;
        else {
            Node slow = head;
            Node fast = slow.next;
            while (fast != null) {
                if(slow.value != fast.value) {
                    slow = slow.next;
                    fast = slow.next;
                } else {
                    fast = fast.next;
                    slow.next = fast;
                }
            }
        }
    }

    public boolean isPalindrome(Node head) {
        Node first_half = head;
        Node curr = findMiddle();
        while (first_half.next != curr)
            first_half = first_half.next;

        Node prev = null;
        Node nextptr = null;
        while (curr != null) {
            nextptr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextptr;
        }
        first_half.next = prev;

        Node curr_1 = head;
        Node curr_2 = prev;

        while (curr_1 != prev && curr_2 != null) {
            if(curr_1.value != curr_2.value)
                return false;
            curr_1 = curr_1.next;
            curr_2 = curr_2.next;
        }
        return true;
    }
    /*
     *  Update
     *      - Beginning
     *      - End
     *      - At any location
     *          - based on data
     *          - based on position
     */

    /*
     *  Delete
     *      - Beginning
     *      - End
     *      - At any location
     *          - based on data
     *          - based on position
     */


     //  PRINT

    public void printList(Node head) {
        Node curr = head;
        while (curr.next != null ) {
            if(curr.next == head)
                break;
            System.out.print(curr.value + " --> ");
            curr = curr.next;
        }
        System.out.print(curr.value);
    }
}
