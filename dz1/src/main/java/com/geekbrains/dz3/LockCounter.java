package com.geekbrains.dz3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class LockCounter {
    final ReentrantLock lock = new ReentrantLock();
    int counter = 0;

    void doCounter() {
        for (int i = 0; i < 10; i++) {
        lock.lock();
        try {
            System.out.println(counter);
            counter++;
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    }

    public static void main(String[] args) {
        final LockCounter lockCounter = new LockCounter();
        final ExecutorService service = Executors.newFixedThreadPool(2);

        service.execute(lockCounter :: doCounter);

        service.shutdown();
    }
}
