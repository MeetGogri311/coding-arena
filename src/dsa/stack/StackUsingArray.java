package dsa.stack;

public class StackUsingArray implements Stack {
    private int[] stack;
    private int size;

    public StackUsingArray(int n) {
        stack = new int[n];
        size = 0;
    }

    public void push(int val) {
        if (size == stack.length) {
            throw new IndexOutOfBoundsException("stack overflow");
        }
        stack[size] = val;
        size++;
    }

    public int size() {
        return size;
    }

    public int pop() {
        if (size == 0) {
            throw new IndexOutOfBoundsException("stack underflow");
        }
        size--;
        return stack[size];
    }

    public int top() {
        if (size == 0) {
            throw new IndexOutOfBoundsException("stack underflow");
        }
        return stack[size - 1];
    }

    public boolean empty() {
        return size == 0;
    }
}
