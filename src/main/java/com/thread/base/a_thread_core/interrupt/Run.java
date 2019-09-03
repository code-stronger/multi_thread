package com.thread.base.a_thread_core.interrupt;

/**
 * @program: multi_thread
 * @description:
 * @create: 2019-09-03 15:20
 */
public class Run {
    public static void main(String[] args){
        test2();
    }


    /*
    先interrupt然后sleep
    结果：程序停止
    main end
    i=0
    ...
    i=999997
    i=999998
    i=999999
    run begin
    thread catch: false
    java.lang.InterruptedException: sleep interrupted
        at java.lang.Thread.sleep(Native Method)
        at com.thread.base.a_thread_core.interrupt.MyThread2.run(MyThread2.java:17)
    */
    public static void test2() {
        try {
            MyThread2 myThread = new MyThread2();
            myThread.start();
            myThread.interrupt();
        }catch (Exception e){
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("main end");
    }

    /*
    在线程sleep时interrupt线程
    结果：程序停止
    run begin
    main end
    thread catch: false
    java.lang.InterruptedException: sleep interrupted
        at java.lang.Thread.sleep(Native Method)
        at com.thread.base.a_thread_core.interrupt.MyThread1.run(MyThread1.java:14)
    */
    public static void test1() {
        try {
            MyThread1 myThread = new MyThread1();
            myThread.start();
            Thread.sleep(1000);
            myThread.interrupt();
        }catch (Exception e){
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("main end");
    }
}