package _01_trien_khai_arraylist;

import java.util.Arrays;

public class MyListBaiTap<E> {
        private int size = 0;
        private static final int DEFAULT_CAPACITY = 10;
        private Object elements[];

        public MyListBaiTap() {
            elements = new Object[DEFAULT_CAPACITY];
        }

        private void ensureCapa() {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }

        public boolean add(E e) {
            if (size == elements.length) {
                ensureCapa();
            }
            elements[size++] = e;
            return true;
        }

        public void add(int index, E e) {
            if (size == elements.length) {
                ensureCapa();
            }
            if (index >= 0) {
                if (index >= size) {
                    elements[size++] = e;
                } else {
                    for (int i = size; i > index; i--) {
                        elements[i] = elements[i - 1];
                    }
                    elements[index] = e;
                    size++;
                }
            }
        }

        public E remove(int index) {
            E returnValue = (E) elements[index];
            if (index < size && index >= 0) {
                int indexToStop;
                if (size < elements.length) {
                    indexToStop = size;
                } else indexToStop = size - 1;
                for (int i = index; i < indexToStop; i++) {
                    elements[i] = elements[i + 1];
                }
                elements[size - 1] = null;
                size--;
            }
            return returnValue;
        }

        public int size() {
            return size;
        }

        public MyListBaiTap clone() {
            MyListBaiTap<E> result = new MyListBaiTap<>();
            result.size = this.size;
            result.elements = this.elements.clone();
            return result;
        }

        public boolean contains(E e) {
            for (Object value : this.elements) {
                if (value == e) return true;
            }
            return false;
        }

        public int indexOf(E e) {
            for (int i = 0; i < size; i++) {
                if (e == elements[i]) return i;
            }
            return -1;
        }

        public E get(int i) {
            if (i >= size || i < 0) {
                throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
            }
            return (E) elements[i];
        }

        public void clear() {
            this.size = 0;
            this.elements = null;
        }

        public void print() {
            System.out.println(Arrays.toString(this.elements));
        }
    }

