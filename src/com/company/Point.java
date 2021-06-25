package com.company;

public class Point {

    private final Object lock = new Object();

    int x;
    int y;

    public void move() {
        x++;
        y++;
    }

    public synchronized void move2() {
        x++;
        y++;
    }

    public void move3() {
        synchronized (lock) {
            x++;
            y++;
        }
    }

    public static synchronized void move4(Point point) {
        point.x++;
        point.y++;

    }
}
