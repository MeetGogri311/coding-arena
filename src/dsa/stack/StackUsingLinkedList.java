package dsa.stack;

class Node{
    public int data;
    public Node next;
    Node(int val){
        data = val;
        next = null;
    }
}
public class StackUsingLinkedList implements  Stack{
    private Node root;
    private int size;
    public StackUsingLinkedList(){
        root = null;
        size = 0;
    }

    public void push(int val){
        Node tmp = new Node(val);
        tmp.next = root;
        root = tmp;
        size++;
    }

    public int pop(){
        if(root == null){
            throw new RuntimeException("stack underflow");
        }
        int val = root.data;
        root = root.next;
        size--;
        return val;
    }

    public int top() {
        if (root == null) {
            throw new RuntimeException("stack underflow");
        }
        return root.data;
    }

    public int size(){
        return size;
    }

    public boolean empty(){
        return size == 0;
    }
}
