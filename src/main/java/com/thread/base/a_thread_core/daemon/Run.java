package com.thread.base.a_thread_core.daemon;

/**
 * @program: multi_thread
 * @description:
 * @create: 2019-09-03 16:00
 */
public class Run {
    public static void main(String[] args) {
//        test1();
        test2();
    }

    /*
    0
    1
    2
    main end
    程序结束
    */
    public static void test2() {
        try {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    MyThread myThread = new MyThread();
//                    myThread.setDaemon(true);
                    myThread.start();
                }
            });
            thread.setDaemon(true);
            thread.start();
            Thread.sleep(4000);
            System.out.println("main end");
        }catch (Exception e) {
            e.printStackTrace();
        }

    }


    /*
    0
    1
    2
    3
    main end
    然后程序就停止了
    */
    public static void test1() {
        try {
            MyThread myThread = new MyThread();
            myThread.setDaemon(true);
            myThread.start();
            Thread.sleep(5000);
            System.out.println("main end");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}