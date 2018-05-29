package com.learning.thread;

import java.util.concurrent.ArrayBlockingQueue;

public class MyArrayBlockingQueue {

    ArrayBlockingQueue<String> abq = new ArrayBlockingQueue<String>(10, true);// Size 10 and fair policy

    String getData() {
        return abq.poll();
    }

    void setData(String e) {
        abq.add(e);
    }

    public static void main(String... strings) {
        final MyArrayBlockingQueue queue = new MyArrayBlockingQueue();
        for (String s : queue.abq) {
            System.out.println(s);
        }

        // Data producer
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    queue.setData(String.valueOf(i));
                }
            }
        }).start();

        // Consumer
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(queue.getData());
                }
            }
        }).start();
    }
}
