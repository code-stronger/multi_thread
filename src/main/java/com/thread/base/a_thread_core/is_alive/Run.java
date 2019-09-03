package com.thread.base.a_thread_core.is_alive;

/**
 * @program: multi_thread
 * @description:
 * @create: 2019-09-03 14:49
 */
public class Run {
    public static void main(String[] args) {
        test2();

    }
    /*
    两种不一样的原因就是test2把当前线程类给了一个新的线程t管理，
    所以这个时候 CountOperate 中的this就不在是其本身,而是t
    */

    /*
    CountOperate: begin
    Thread.currentThread().getName()=main
    Thread.currentThread().isAlive()=true
    this.getName()=Thread-0
    this.isAlive()false
    CountOperate: end
    main begin thread isAlive=false
    main end thread isAlive=true
    Run: begin
    Thread.currentThread().getName()=A
    Thread.currentThread().isAlive()=true
    this.getName()=Thread-0
    this.isAlive()false
    Run: end
    */
    public static void test2() {
        CountOperate c = new CountOperate();
        Thread thread = new Thread(c);
        System.out.println("main begin thread isAlive="+thread.isAlive());
        thread.setName("A");
        thread.start();
        System.out.println("main end thread isAlive="+thread.isAlive());
    }


    /*
    CountOperate: begin
    Thread.currentThread().getName()=main
    Thread.currentThread().isAlive()=true
    this.getName()=Thread-0
    this.isAlive()false
    CountOperate: end
    main begin countOperate isAlive=false
    main end countOperate isAlive=true
    Run: begin
    Thread.currentThread().getName()=A
    Thread.currentThread().isAlive()=true
    this.getName()=A
    this.isAlive()true
    Run: end
    */
    public static void test1() {
        CountOperate countOperate = new CountOperate();
        System.out.println("main begin countOperate isAlive="+countOperate.isAlive());
        countOperate.setName("A");
        countOperate.start();
        System.out.println("main end countOperate isAlive="+countOperate.isAlive());
    }
}