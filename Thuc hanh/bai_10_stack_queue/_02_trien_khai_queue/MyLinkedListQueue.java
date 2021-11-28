package _02_trien_khai_queue;

public class MyLinkedListQueue {
    public class Node {
        private int key;
        private Node next;

        public Node(int key) {
            this.key = key;
            this.next = null;
        }

        public int getKey() {
            return this.key;
        }
    }

    private Node head;
    private Node tail;

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    public void enqueue(int key) {
        Node temp = new Node(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }

    public Node dequeue() {
        if (this.head == null) return null;
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null)
            this.tail = null;
        return temp;
    }
}
