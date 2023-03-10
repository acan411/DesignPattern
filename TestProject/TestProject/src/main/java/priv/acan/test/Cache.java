package priv.acan.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author acan
 * @version 2023/03/10 20:03
 */
public class Cache {

    private static final Map<Integer, Integer> map;

    static {
        map = new HashMap<>();
    }

    public void getDigit(int i) {
        if (map.containsKey(i)) {
            System.out.println("cache contains " + i);
            map.get(i);
        } else {
            System.out.println("cached " + i + " in cache");
            map.put(i, i * 10);
        }
    }
}
