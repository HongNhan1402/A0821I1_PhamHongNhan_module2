package _01_trien_khai_arraylist;

public class MyListTestBaiTap {
    public static void main(String[] args) {
        MyListBaiTap<Integer> list = new MyListBaiTap<Integer>();
        //add
        list.add((int) Math.floor(Math.random() * 50));
        list.add((int) Math.floor(Math.random() * 50));
        list.add(5);
        list.add((int) Math.floor(Math.random() * 50));
        list.add((int) Math.floor(Math.random() * 50));
        list.print();
        System.out.println("size of list = " + list.size());

    }
}
