package MapThucHanhJame;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ThucHanh1 {
    public static void main(String[] args) {
        Map<String, Integer> hasMap = new HashMap<String, Integer>();
        hasMap.put("DucThuan", 31);
        hasMap.put("NA", 25);
        System.out.println(hasMap.keySet());
        System.out.println(hasMap);

        Map<String, Integer> treeMap = new TreeMap<>(hasMap);
        System.out.println("đây là hiển thị của treeMap :" +treeMap);

        Map<String, Integer> likerMap=new LinkedHashMap<>();
        likerMap.put("DucThuan",31);
        likerMap.put("NA",25);
        likerMap.put("Tuan",33);
        System.out.println("đây là nơi hiển thị của linker về phần tử thứ 2 "+ likerMap.get("Tuan"));
    }
}
