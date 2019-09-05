package com.thread.base.e_timer.t1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @program: multi_thread
 * @description:
 * @create: 2019-09-04 16:42
 */
public class RunTimer {
//    private static Timer timer = new Timer(true);
    private static Timer timer = new Timer();
    private static TimerTask task = new TimerTask() {
        @Override
        public void run() {
            System.out.println("task: " + new Date());
        }
    };

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = sdf.parse("2019-09-04 16:48:30");
        timer.schedule(task, parse);

    }

}