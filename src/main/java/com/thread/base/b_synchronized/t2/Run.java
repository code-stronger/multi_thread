package com.thread.base.b_synchronized.t2;

/**
 * @program: multi_thread
 * @description:
 * @create: 2019-09-03 18:07
 */
public class Run {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        OutClass.InnerClass1 innerClass1 = outClass.new InnerClass1();
        OutClass.InnerClass2 innerClass2 = outClass.new InnerClass2();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                innerClass1.method1();
            }
        });
        thread.start();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                innerClass2.method2();
            }
        });
        thread1.start();

    }
}