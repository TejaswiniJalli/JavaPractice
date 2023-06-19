package Day13;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Deadlock {

    private static final Lock lock1 = new ReentrantLock();
    private static final Lock lock2 = new ReentrantLock();

    public static void  deadlock() {
        lock1.lock();
        try {
            System.out.println("Thread 1: acquired lock 1");
            lock2.lock();
            try {
                System.out.println("Thread 1: acquired lock 2");
            } finally {
                lock2.unlock();
            }
        } finally {
            lock1.unlock();
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                deadlock();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                deadlock();
            }
        });

        thread1.start();
        thread2.start();
    }
}