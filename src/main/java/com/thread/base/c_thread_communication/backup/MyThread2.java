package com.thread.base.c_thread_communication.backup;

/**
 * @program: multi_thread
 * @description:
 * @create: 2019-09-04 11:37
 */
public class MyThread2 extends Thread {
    private MyService myService;
    public MyThread2(MyService myService) {
        this.myService = myService;
    }
    @Override
    public void run() {
        myService.backupB();
    }
}