package com.thread.base.d_lock.reentrant_lock.t2;

/**
 * @program: multi_thread
 * @description:
 * @create: 2019-09-04 16:04
 */
public class MyThread extends Thread {
    private MyService myService;

    public MyThread(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        super.run();
        myService.test();
    }
}