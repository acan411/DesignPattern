package priv.acan;

import java.util.HashMap;
import java.util.Map;

public class Huawei {

    public static void main(String[] args) {

        BeanCache.loadCache();
        Bean bean1 = BeanCache.getCache(1);

    }
}
