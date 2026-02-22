package dsa;

import dsa.queue.Queue;
import dsa.queue.QueueUsingArray;
import dsa.sorting.Order;
import dsa.sorting.Sorter;
import dsa.stack.Stack;
import dsa.stack.StackUsingArray;
import dsa.stack.StackUsingLinkedList;

public class Main {
    private static void testStack(Stack s) {
        System.out.printf("\n\nTesting Stack: %s\n", s.getClass().getName());
        for (int i = 0; i < 10; i++) {
            s.push(i);
        }
        try {
            System.out.println("Trying to push in stack...");
            s.push(100);
        } catch (RuntimeException e) {
            System.out.printf("Caught Exception: %s in class %s\n", e.getMessage(), s.getClass().getName());
        }
        while (!s.empty()) {
            System.out.printf("%d ", s.top());
            s.pop();
        }
        try {
            System.out.println("\nTrying to pop from empty stack");
            System.out.println(s.pop());
        } catch (RuntimeException e) {
            System.out.printf("Caught Exception: %s in class %s", e.getMessage(), s.getClass().getName());
        }
    }

    private static void testQueue(Queue q) {
        System.out.printf("\n\nTesting Stack: %s\n", q.getClass().getName());
        for (int i = 0; i < 10; i++) {
            q.enqueue(i);
        }
        try {
            System.out.println("Trying to push in queue...");
            q.enqueue(100);
        } catch (RuntimeException e) {
            System.out.printf("Caught Exception: %s in class %s\n", e.getMessage(), q.getClass().getName());
        }
        while (!q.empty()) {
            System.out.printf("%d ", q.peek());
            q.dequeue();
        }
        try {
            System.out.println("\nTrying to dequeue from empty queue");
            System.out.println(q.dequeue());
        } catch (RuntimeException e) {
            System.out.printf("Caught Exception: %s in class %s", e.getMessage(), q.getClass().getName());
        }
    }

    private static void testHeapSort() {
        int[] arr = {10, 38, 2, 3, 24, 13, 9};
        Sorter.heapSort(arr, Order.ASC);
        System.out.print("\n\nHeap Sort in Ascending Order: ");
        for (int el : arr) System.out.printf("%d ", el);
        arr = new int[]{10, 38, 2, 3, 24, 13, 9};
        Sorter.heapSort(arr, Order.DESC);
        System.out.print("\nHeap Sort in Descending Order: ");
        for (int el : arr) System.out.printf("%d ", el);
    }

    public static void main(String[] args) {
        Stack s = new StackUsingArray(10);
        testStack(s);

        s = new StackUsingLinkedList();
        testStack(s);

        Queue q = new QueueUsingArray(10);
        testQueue(q);

        testHeapSort();
    }
}
