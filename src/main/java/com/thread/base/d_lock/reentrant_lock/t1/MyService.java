package com.thread.base.d_lock.reentrant_lock.t1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: multi_thread
 * @description:
 * @create: 2019-09-04 14:30
 */
public class MyService {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void test1() {
        try {
            lock.lock();
            System.out.println("wait begin");
            condition.await();
            System.out.println("wait end");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println("wait finally");
        }
    }

    public void test2() {
        try {
            lock.lock();
            System.out.println("signal begin");
            condition.signal();
            System.out.println("signal end");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
            System.out.println("signal finally");
        }
    }
}