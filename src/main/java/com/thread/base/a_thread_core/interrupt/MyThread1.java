package com.thread.base.a_thread_core.interrupt;

/**
 * @program: multi_thread
 * @description:
 * @create: 2019-09-03 15:05
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        super.run();
        try{
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        }catch (Exception e) {
            System.out.println("thread catch: " + this.isInterrupted());
            e.printStackTrace();
        }
    }
}