package Queues;

import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> vStack1 = new Stack<>();
    public static void main(String[] args) {
        QueueUsingStack vQueue = new QueueUsingStack();
        vQueue.insert_into_Queue(1);
        vQueue.insert_into_Queue(2);
        vQueue.insert_into_Queue(3);
        vQueue.insert_into_Queue(4);

        vQueue.showStack();

        System.out.println("Popped value: " + vQueue.remove_from_Queue());
        System.out.println("Popped value: " + vQueue.remove_from_Queue());

        vQueue.showStack();
    }
    public void insert_into_Queue(int value) {
        System.out.println("Inserted " + value);
        vStack1.push(value);
    }

    public int remove_from_Queue() {
        Stack<Integer> vStack2 = new Stack<>();
        while (!vStack1.isEmpty())  {
            int temp = vStack1.pop();
            vStack2.push(temp);
        }
        int result = vStack2.pop();

        while (!vStack2.isEmpty())  {
            int temp = vStack2.pop();
            vStack1.push(temp);
        }
        return result;
    }

    public void showStack() {
        System.out.println(vStack1);
    }
}
