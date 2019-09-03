package com.thread.base.a_thread_core.interrupt;

/**
 * @program: multi_thread
 * @description:
 * @create: 2019-09-03 15:06
 */
public class InterruptTest {
    public static void main(String[] args) {
        test2();
    }

    /*
    是否停止1？ =true
    是否停止2？ =true
    end
    */
    public static void test2() {
        Thread.currentThread().interrupt();
        System.out.println("是否停止1？ =" + Thread.currentThread().isInterrupted());
        System.out.println("是否停止2？ =" + Thread.currentThread().isInterrupted());
        System.out.println("end");
    }

    /*
    是否停止1？ =true
    是否停止2？ =false
    end
    */
    public static void test1() {
        Thread.currentThread().interrupt();
        System.out.println("是否停止1？ =" + Thread.interrupted());
        System.out.println("是否停止2？ =" + Thread.interrupted());
        System.out.println("end");
    }
}