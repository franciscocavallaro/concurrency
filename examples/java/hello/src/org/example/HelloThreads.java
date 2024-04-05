package org.example;

public class HelloThreads {
    private static void hello() throws InterruptedException {
        var t1 = new Thread(() -> {
            sleep(1000);
            printHello();
        });
        var t2 = new Thread(() -> System.out.println("Hello from thread 2")); //create object of thread
        t1.start(); //starts running the thread
        t2.start();
        t1.join(); // wait for t1 to finish
        t2.join();
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