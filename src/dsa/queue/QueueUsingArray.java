package dsa.queue;

public class QueueUsingArray implements Queue {
    private int[] queue;
    private int size, top;

    public QueueUsingArray(int n) {
        queue = new int[n];
        top = n;
        size = 0;
    }

    public void enqueue(int val) {
        if (size == queue.length) {
            throw new ArrayIndexOutOfBoundsException("stack overflow");
        }
        if (top == queue.length) top = 0;
        queue[(top + size) % queue.length] = val;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException("stack underflow");
        }
        int val = queue[top];
        top = (top + 1) % queue.length;
        size--;
        return val;
    }

    public int peek() {
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException("stack underflow");
        }
        return queue[top];
    }

    public int size() {
        return size;
    }

    public boolean empty() {
        return size == 0;
    }
}
