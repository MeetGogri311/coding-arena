package dsa;
import dsa.stack.Stack;
import dsa.stack.StackUsingArray;

public class Main {
    public static void main(String[] args) {
        Stack s = new StackUsingArray(10);
        for (int i = 0; i < 10; i++) {
            s.push(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", s.top());
            s.pop();
        }
        try {
            s.pop();
        } catch (IndexOutOfBoundsException e) {
            System.err.printf("\nCaught Exception: %s", e.getMessage());
        }
    }
}
