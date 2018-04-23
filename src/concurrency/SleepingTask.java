package concurrency;

import java.util.concurrent.TimeUnit;

/**
 *
 * concurrency
 * 休眠
 *
 * 终止任务 在一个给定时间内，停止任务执行。
 * 2018/4/23-21:46
 * 2018
 * Created by wuqiang on 2018/4/23.
 */
public class SleepingTask extends LiftOff{

    @Override
    public void run() {
        while (countDown-->0) {
            System.out.println(status());
            try {
                TimeUnit.MILLISECONDS.sleep(100);/*注意，这个异常不能抛出去*/
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread thread=new Thread(new SleepingTask());
        thread.start();
    }
}
