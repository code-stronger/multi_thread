package com.thread.base.a_thread_core.is_alive;

/**
 * @program: multi_thread
 * @description:
 * @create: 2019-09-03 14:46
 */
public class CountOperate extends Thread{

    public CountOperate() {
        System.out.println("CountOperate: begin");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive()="+Thread.currentThread().isAlive());
        System.out.println("this.getName()="+this.getName());
        System.out.println("this.isAlive()"+this.isAlive());
        System.out.println("CountOperate: end");
    }
    @Override
    public void run() {
        super.run();
        System.out.println("Run: begin");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive()="+Thread.currentThread().isAlive());
        System.out.println("this.getName()="+this.getName());
        System.out.println("this.isAlive()"+this.isAlive());
        System.out.println("Run: end");
    }
}