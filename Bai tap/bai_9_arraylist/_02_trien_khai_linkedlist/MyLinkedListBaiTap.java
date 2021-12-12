package _02_trien_khai_linkedlist;

public class MyLinkedListBaiTap {
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    private Node head;
    private int numNodes = 0;

    public MyLinkedListBaiTap(Object o) {
        head = new Node(o);
        this.numNodes++;
    }

    public void add(int index, Object o) {
        Node temp = this.head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(o);
        temp.next.next = holder;
        this.numNodes++;
    }

    public void addFirst(Object o) {
        Node temp = this.head;
        this.head = new Node(o);
        this.head.next = temp;
        this.numNodes++;
    }

    public void addLast(Object o) {
        Node temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(o);
        this.numNodes++;
    }

    public Object removeFirst() {
        Node result = this.head;
        this.head = this.head.next;
        this.numNodes--;
        return result;
    }

    public Object remove(int index) {
        if (index == 0) return removeFirst();
        else {
            Node temp = this.head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node removedObject = temp.next;
            temp.next = temp.next.next;
            this.numNodes--;
            return removedObject.getData();
        }
    }

    public boolean remove(Object o) {
        Node temp = this.head;
        int count = 0;
        int index = -1;
        while (temp.next != null) {
            if (temp.getData().equals(o)) {
                index = count;
                break;
            } else {
                count++;
                temp = temp.next;
            }
        }
        if (index == -1) return false;
        else {
            remove(index);
            return true;
        }
    }

    public int size() {
        return this.numNodes;
    }

    public MyLinkedListBaiTap clone() {
        Object obj = this.head.getData();
        MyLinkedListBaiTap llClone = new MyLinkedListBaiTap(obj);
        Node tempClone = llClone.head;
        Node temp = this.head;
        while (temp.next != null) {
            tempClone.next = new Node(temp.next.getData());
            tempClone = tempClone.next;
            temp = temp.next;
        }
        return llClone;
    }

    public boolean contains(Object o) {
        Node temp = this.head;
        while (temp.next != null) {
            if (temp.getData().equals(o)) return true;
            temp = temp.next;
        }
        if (temp.getData().equals(o)) return true;
        return false;
    }

    public int indexOf(Object o) {
        int count = 0;
        Node temp = this.head;
        while (temp.next != null) {
            if (temp.getData().equals(o)) {
                return count;
            }
            count++;
            temp = temp.next;
        }
        if (temp.getData().equals(o)) return count;
        return -1;
    }

    public Object get(int index) {
        Node temp = this.head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.getData();
    }

    public Object getFirst() {
        return this.head.getData();
    }

    public Object getLast() {
        Node temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.getData();
    }

    public void printList() {
        Node temp = this.head;
        System.out.println("---------");
        while (temp != null) {
            System.out.print(temp.getData() + "\t\t");
            temp = temp.next;
        }
        System.out.println();
    }
}
