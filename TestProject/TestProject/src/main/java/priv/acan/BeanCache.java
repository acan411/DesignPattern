package priv.acan;

import java.util.Hashtable;

public class BeanCache {

    private BeanCache() {
    }

    private static final Hashtable<Integer, Bean> HASHTABLE = new Hashtable<>();

    public static void loadCache() {
        HASHTABLE.put(1, new Bean1());
        HASHTABLE.put(2, new Bean2());
    }

    public static Bean getCache(int i) {
        return HASHTABLE.get(i);
    }
}
