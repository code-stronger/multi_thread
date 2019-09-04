package com.thread.base.d_lock.reentrant_lock.t1;

/**
 * @program: multi_thread
 * @description:
 * @create: 2019-09-04 14:35
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyService myService = new MyService();
            MyThread myThread = new MyThread(myService);
            myThread.start();
            Thread.sleep(2000);
            myService.test2();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}