package dsa.queue;

public interface Queue {
    void enqueue(int val);

    int dequeue();

    int peek();

    int size();

    boolean empty();
}
