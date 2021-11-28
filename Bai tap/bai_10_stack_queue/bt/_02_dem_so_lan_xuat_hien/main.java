package _02_dem_so_lan_xuat_hien;

import java.util.Set;
import java.util.TreeMap;

public class main {
    public static void main(String[] args) {
        String initString = "Chương trình đếm các lần xuất hiện của từ " +
                "trong một văn bản và hiển thị các từ và sự xuất hiện của chúng theo thứ " +
                "tự trong bảng chữ cái của các từ";
        String[] words = initString.split("\\s");
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        //đếm và thêm vào map
        treeMap.put(words[0].trim(), 1);
        for (int i = 1; i < words.length; i++) {
            String key = words[i].trim();
            if (!treeMap.containsKey(key)) {
                treeMap.put(key, 1);
            } else {
                int valueOfKey = treeMap.get(key);
                treeMap.put(key, valueOfKey + 1);
            }
        }
        //in ra
        show(treeMap);
    }

    public static void show(TreeMap<String, Integer> map) {
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key + " - " + map.get(key));
        }
    }
}
