package com.thread.base.c_thread_communication.backup;

/**
 * @program: multi_thread
 * @description:
 * @create: 2019-09-04 11:34
 */
public class MyService {
    private boolean flag = true;

    synchronized public void backupA() {
        try {
            while (flag) {
                this.wait();
            }
            System.out.println("**************");
            flag = true;
            this.notifyAll();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized public void backupB() {
        try {
            while (!flag) {
                this.wait();
            }
            System.out.println("##############");
            flag = false;
            this.notifyAll();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}