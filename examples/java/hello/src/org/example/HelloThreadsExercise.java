package org.example;

import java.util.ArrayList;

public class HelloThreadsExercise {

    private static void threads() throws InterruptedException {
        var threads = new ArrayList<Thread>();
        for (int i = 0; i < 9; i++) {
            var currentI = i;
            threads.add(new Thread(() -> {
                System.out.println("Hello from thread " + currentI);
                System.out.println("Goodbye from thread " + currentI);
            }));
        }
        for (Thread t : threads) {
            t.start();
        }
        for (Thread t : threads) {
            t.join();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("====== Hello Threads =======");
        threads();
        System.out.println("====== Good Bye Threads =======");
    }
}
