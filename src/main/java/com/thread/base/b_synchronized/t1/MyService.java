package com.thread.base.b_synchronized.t1;

/**
 * @program: multi_thread
 * @description:
 * @create: 2019-09-03 17:05
 */
public class MyService {

    synchronized public void service1() {
        System.out.println("service1");
        service2();
    }

    synchronized public void service2() {
        System.out.println("service2");
        service3();
    }

    synchronized public void service3() {
        System.out.println("service3");
    }
}