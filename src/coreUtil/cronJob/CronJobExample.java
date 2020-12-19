package coreUtil.cronJob;

import java.util.Timer;
import java.util.TimerTask;

/**
 * core java timer and timerTask, scheduling a task.
 */
public class CronJobExample {

    class MyTimerTask extends TimerTask {

        @Override
        public void run() {
            System.out.println("impl. my task...");
        }
    }

    public static void main(String... args) {

        Timer timer = new Timer();
        MyTimerTask myTimerTask = new CronJobExample().new MyTimerTask();

        //impl this task after a delay(ms)
        timer.schedule(myTimerTask, 1000);

        MyTimerTask myPeriodTimerTask = new CronJobExample().new MyTimerTask();
        //repeating task after a initial delay, in a period.
        timer.schedule(myPeriodTimerTask, 0, 1000);
    }

}
