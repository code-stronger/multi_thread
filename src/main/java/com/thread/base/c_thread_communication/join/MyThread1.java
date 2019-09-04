package com.thread.base.c_thread_communication.join;

/**
 * @program: multi_thread
 * @description:
 * @create: 2019-09-04 11:48
 */
public class MyThread1 extends Thread {
    private Thread thread;
    public MyThread1(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        super.run();
        try {
            System.out.println("thread1 begin");
            thread.join();
            System.out.println("thread1 end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}