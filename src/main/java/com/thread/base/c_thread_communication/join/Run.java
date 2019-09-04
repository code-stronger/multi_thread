package com.thread.base.c_thread_communication.join;

/**
 * @program: multi_thread
 * @description:
 * @create: 2019-09-04 11:49
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread2 myThread2 = new MyThread2();
        MyThread1 myThread1 = new MyThread1(myThread2);

        myThread2.start();
        Thread.sleep(1000);
        myThread1.start();
    }
}