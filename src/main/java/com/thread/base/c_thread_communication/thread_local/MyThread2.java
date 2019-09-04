package com.thread.base.c_thread_communication.thread_local;

/**
 * @program: multi_thread
 * @description:
 * @create: 2019-09-04 14:09
 */
public class MyThread2 extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 10; i++) {
                MyThreadLocal.t1.set("B"+i);
                System.out.println(MyThreadLocal.t1.get());
                Thread.sleep(200);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}