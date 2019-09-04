package com.thread.base.c_thread_communication.thread_local;

/**
 * @program: multi_thread
 * @description:
 * @create: 2019-09-04 14:12
 */
public class Run {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
    }
}