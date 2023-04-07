package locks;

import utils.ConcurrentUtils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.StampedLock;

public class ExampleConvertToWriteLock {
    private static int count = 0;

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        StampedLock lock = new StampedLock();

        executor.submit(() -> {
            long stamp = lock.readLock();
            try {
                if (count == 0) {
                    stamp = lock.tryConvertToWriteLock(stamp);
                    if (stamp == 0L) {
                        System.out.println("Could not convert to write lock");
                        stamp = lock.writeLock();
                    }
                    count = 23;
                }
                System.out.println(count);
            } finally {
                lock.unlock(stamp);
            }
        });

        ConcurrentUtils.stop(executor);
    }
}
