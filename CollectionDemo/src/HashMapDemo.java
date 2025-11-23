import java.util.HashMap;
import java.util.TreeMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap <Integer, String> map = new HashMap<>();
        map.put(20, "Rohit");
        map.put(50, "Nayan");
        map.put(80, "Rohan");
        map.put(10, "Bhushan");
        map.put(40, "Vishal");

        System.out.println("Without shorting>> "+map);

        TreeMap <Integer, String> treeMap = new TreeMap<>(map);
        System.out.println(treeMap);

    }
}
