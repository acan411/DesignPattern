package priv.test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MultithreadingTest {

    private final static Lock lock = new ReentrantLock();
    private static int cnt = 0;

    public static void main(String[] args) {

        String mThread = "m";
        String nThread = "n";
        String jThread = "j";
        String kThread = "k";

        newThread(mThread, 0);
        newThread(nThread, 1);
        newThread(jThread, 2);

        print(kThread, 3);
    }

    private static void newThread(String threadName, int flag) {
        new Thread(() -> {
            print(threadName, flag);
        }, threadName).start();
    }

    private static void print(String str, int flag) {
        for (int i = 0; i < 10; ) {
            lock.lock();
            if (cnt % 4 == flag) {
                ++cnt;
                ++i;
                System.out.println(str);
            }
            lock.unlock();
        }
    }
}
