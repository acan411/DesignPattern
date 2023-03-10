package priv.acan.test;

import org.junit.Test;

/**
 * @author acan
 * @version 2022/12/17 23:44
 */
public class AcanTest {

    @Test
    public void asdf() {
        int i = 0;

        System.out.println(1);
        Cache cache = new Cache();
        cache.getDigit(i);

        System.out.println(2);
        Cache cache1 = new Cache();
        cache1.getDigit(i);
    }
}
