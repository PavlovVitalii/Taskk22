package com.company;

import java.util.concurrent.CountDownLatch;

public class Worker implements Runnable {

    private final Point point;
    private CountDownLatch count;
    private CountDownLatch workers;

    public Worker(CountDownLatch count, CountDownLatch workers, Point point) {
        this.count = count;
        this.workers = workers;
        this.point = point;
    }

    @Override
    public void run() {
//        point.move();
//        point.move2();
//        point.move3();
          Point.move4(point);
    }
}
