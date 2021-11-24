package Array_list;

import java.util.Arrays;

public class List_Don_gian<E> {
    private int size = 0;
    private int DEFAULT_CAPACITY = 10;
    private Object elements [];
    public List_Don_gian () {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size] = e;
        size++;
    }
    public void ensureCapa() {
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public E get(int index) {
        if (index >= size || index<0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + size );
        }
        return (E) elements[index];
    }
}