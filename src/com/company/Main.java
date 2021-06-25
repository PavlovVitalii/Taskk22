package com.company;

import java.util.concurrent.*;

public class Main {

    ExecutorService executor = Executors.newCachedThreadPool();


    public static void main(String[] args) {

        new Main().run();

    }

    private void run() {
        task01();
        task02();
        task03();
    }

    private void task01() {
        Point point = new Point();
        CountDownLatch count = new CountDownLatch(1);
        CountDownLatch workers = new CountDownLatch(2000);

        for (int i = 1; i <= 2000; i++) {
            executor.execute(new Worker(count, workers, point));
        }

        executor.shutdown();
        System.out.println("x = " + point.x);
        System.out.println("y = " + point.y);
    }

    private void task02() {
        Fibonachi fibonachi = new Fibonachi();
        fibonachi.start();
    }

    private void task03() {
        Fibonachi_2 fibonachi_2 = new Fibonachi_2();
        Thread thread = new Thread(fibonachi_2);
        thread.start();
    }
}
