package com.thread.base.c_thread_communication.join;

/**
 * @program: multi_thread
 * @description:
 * @create: 2019-09-04 11:48
 */
public class MyThread2 extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            System.out.println("thread2 begin");
            Thread.sleep(5000);
            System.out.println("thread2 end");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}