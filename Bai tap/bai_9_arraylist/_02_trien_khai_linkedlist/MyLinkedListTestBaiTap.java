package _02_trien_khai_linkedlist;

public class MyLinkedListTestBaiTap {
        public static void main(String[] args) {
            System.out.println("/=/=/=/= TESTING /=/=/=/=");
            MyLinkedListBaiTap ll = new MyLinkedListBaiTap(10);

            //add
            ll.addFirst(11.5);
            ll.addFirst(13.7);
            ll.add(2, 19);
            ll.add(5, "20");
            ll.addLast(99);
            ll.addLast(991);
            ll.printList();
        }
    }

