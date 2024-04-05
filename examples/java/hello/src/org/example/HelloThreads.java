package org.example;

import java.util.ArrayList;

public class HelloThreads {
    private static void hello() {
        var t1 = new Thread(() -> System.out.println("Hello from thread 1"));
        var t2 = new Thread(() -> System.out.println("Hello from thread 2"));
        t1.start();
        t2.start();
    }


    public static void main(String[] args) throws InterruptedException {
        System.out.println("====== Hello Threads    =======");
        hello();
        System.out.println("====== Good Bye Threads =======");
    }

    private static void sleep(int time) throws RuntimeException {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void printHello() {
        System.out.println("Hello from thread 1");
    }
}