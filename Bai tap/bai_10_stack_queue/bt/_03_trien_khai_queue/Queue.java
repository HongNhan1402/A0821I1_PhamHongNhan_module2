package _03_trien_khai_queue;

public class Queue<E> {
    private class Node {
        private E data;
        private Node next;

        public Node(E data) {
            this.data = data;
        }

        public E getData() {
            return data;
        }
    }

    private Node front;
    private Node rear;

    public Queue() {
    }

    //chèn 1 phần tử
    public void enQueue(E data) {
        Node temp = new Node(data);
        if (this.front == null) {
            this.front = this.rear = temp;
        } else {
            this.rear.next = temp;
            this.rear = this.rear.next;
            this.rear.next = this.front;
        }
    }

    //lấy 1 phần tử
    public E deQueue() {
        Node nodeRemoved = this.front;
        if (this.front == this.rear) {
            this.front = null;
            this.rear = null;
        } else {
            this.front = this.front.next;
            this.rear.next = this.front;
        }
        return nodeRemoved.getData();
    }

    public boolean isEmpty() {
        return this.front == null && this.rear == null;
    }

    //hiển thị
    public void displayQueue() {
        if (this.isEmpty()) {
            System.out.println("---Queue Empty---");
            return;
        }
        Node temp = this.front;
        System.out.println("------Queue------");
        while (temp.next != this.front) {
            System.out.print(temp.getData() + "\t\t");
            temp = temp.next;
        }
        System.out.println(this.rear.getData() + "\t\t");
    }
}
