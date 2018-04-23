package concurrency;

import java.util.concurrent.TimeUnit;

/**
 *
 * concurrency
 * 后台线程
 *
 * 2018/4/23-22:03
 * 2018
 * Created by wuqiang on 2018/4/23.
 */
public class SimpleDaemons implements Runnable {
    @Override
    public void run() {
        while(true){
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread()+" "+this);
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new SimpleDaemons());
        thread.setDaemon(true);//设置为 后台线程，如果不设置，则程序会一直运行。
        thread.start();
        System.out.println("All daemons start()");
    }
}
