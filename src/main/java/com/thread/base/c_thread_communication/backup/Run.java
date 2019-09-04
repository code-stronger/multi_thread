package com.thread.base.c_thread_communication.backup;

/**
 * @program: multi_thread
 * @description:
 * @create: 2019-09-04 11:38
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        for (int i = 0; i < 10; i++) {
            new MyThread1(myService).start();
            new MyThread2(myService).start();
        }
    }
}