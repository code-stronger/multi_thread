package com.thread.base.d_lock.reentrant_lock.t2;

/**
 * @program: multi_thread
 * @description:
 * @create: 2019-09-04 16:05
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        MyThread myThread = new MyThread(myService);
        myThread.start();
        Thread.sleep(1000);
        myThread.interrupt();
    }
}