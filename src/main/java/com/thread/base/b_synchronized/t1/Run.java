package com.thread.base.b_synchronized.t1;

/**
 * @program: multi_thread
 * @description:
 * @create: 2019-09-03 17:07
 */
public class Run {
    /*
    service1
    service2
    service3
    service1
    service2
    service3
    */
    public static void main(String[] args) {
        MyService myService = new MyService();
        MyThread1 myThread1 = new MyThread1(myService);
        MyThread2 myThread2 = new MyThread2(myService);
        myThread2.start();
        myThread1.start();
    }
}