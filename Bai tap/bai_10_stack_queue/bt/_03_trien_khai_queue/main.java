package _03_trien_khai_queue;

public class main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(5);
        queue.enQueue(9);
        queue.enQueue(3);
        queue.enQueue(2);
        queue.enQueue(6);
        System.out.println("before remove:");
        queue.displayQueue();
        queue.deQueue();
        System.out.println("after remove:");
        queue.displayQueue();
        queue.deQueue();
        System.out.println("after remove:");
        queue.displayQueue();
        queue.deQueue();
        System.out.println("after remove:");
        queue.displayQueue();
        queue.enQueue(15);
        System.out.println("after add:");
        queue.displayQueue();
    }
}
