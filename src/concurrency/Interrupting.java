package concurrency;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 *
 * concurrency
 * 中断
 *
 * 用Executor 展示了基本的interrupt()用法
 * 2018/4/27-21:10
 * 2018
 * Created by wuqiang on 2018/4/27.
 */

class SleepBlocked implements Runnable{

    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
        System.out.println("Exiting SleepBlocked.run()");
    }
}

class IOBlocked implements Runnable{

    private InputStream in;

    public IOBlocked(InputStream in) {
        this.in = in;
    }

    @Override
    public void run() {
        System.out.println("Waiting for read();");
        try {
            in.read();
        } catch (IOException e) {
            if(Thread.currentThread().isInterrupted()){
                System.out.println("Interrupted from blocked I/O");
            }else{
                throw new RuntimeException(e);
            }
        }
        System.out.println("Exiting IOBlocked.run()");
    }
}

class SynchronizedBlocked implements Runnable{

    public synchronized void f(){/*只要 调用了这个方法，就永远出不去了*/
        while(true){

        }
    }

    public SynchronizedBlocked(){
        new Thread(){
            @Override
            public void run(){
                f();
            }
        }.start();
    }
    @Override
    public void run() {
        System.out.println("Trying to call f()");
        f();
        System.out.println("Exiting SynchronizedBlocked.run()");
    }
}
public class Interrupting {
    private static ExecutorService exec=Executors.newCachedThreadPool();

    static void test(Runnable r) throws InterruptedException {
        Future<?> f = exec.submit(r);
        TimeUnit.MILLISECONDS.sleep(10000);
        System.out.println("Interrupting "+r.getClass().getName());
        f.cancel(true);
        System.out.println("Interrupt sent to "+r.getClass().getName());
    }

    public static void main(String[] args) throws InterruptedException {
        test(new SleepBlocked());
    }
}
