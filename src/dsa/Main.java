package dsa;

import dsa.stack.Stack;
import dsa.stack.StackUsingArray;
import dsa.stack.StackUsingLinkedList;

public class Main {
    private static void testStack(Stack s) {
        System.out.printf("\n\nTesting Stack: %s\n", s.getClass().getName());
        for (int i = 0; i < 10; i++) {
            s.push(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", s.top());
            s.pop();
        }
        try {
            s.pop();
        } catch (RuntimeException e) {
            System.out.printf("\nCaught Exception: %s in class %s", e.getMessage(), s.getClass().getName());
        }
    }

    public static void main(String[] args) {
        Stack s = new StackUsingArray(10);
        testStack(s);

        s = new StackUsingLinkedList();
        testStack(s);
    }
}
