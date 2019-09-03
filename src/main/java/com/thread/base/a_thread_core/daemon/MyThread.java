package com.thread.base.a_thread_core.daemon;

/**
 * @program: multi_thread
 * @description:
 * @create: 2019-09-03 15:59
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            int i = 0;
            while (true) {
                Thread.sleep(1000);
                System.out.println(i++);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}