package com.thread.base.d_lock.reentrant_lock.t2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: multi_thread
 * @description:
 * @create: 2019-09-04 16:03
 */
public class MyService {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void test() {
        try {
            lock.lock();
            System.out.println("begin");
            condition.awaitUninterruptibly();
            System.out.println("end");
            lock.unlock();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}