package com.thread.base.b_synchronized.t2;

/**
 * @program: multi_thread
 * @description:
 * @create: 2019-09-03 18:05
 */
public class OutClass {
      class InnerClass1{
        synchronized public void method1() {
            System.out.println(Thread.currentThread().getName() + "begin method1");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "end method1");
        }
    }

     class InnerClass2{
        synchronized public void method2() {
            System.out.println(Thread.currentThread().getName() + "begin method1");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "end method2");
        }
    }
}