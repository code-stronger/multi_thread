package com.thread.base.b_synchronized.t1;

/**
 * @program: multi_thread
 * @description:
 * @create: 2019-09-03 17:06
 */
public class MyThread1 extends Thread {
    public MyService myService;

    public MyThread1(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        super.run();
        myService.service1();
    }
}