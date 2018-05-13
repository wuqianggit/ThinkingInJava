package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * concurrency
 * 同步控制EvenGenerator
 *
 * 在方法上加上锁
 * 2018/4/25-21:14
 * 2018
 * Created by wuqiang on 2018/4/25.
 */
public class SynchronizedGenerator extends IntGenerator {

    private int currentEvenValue=0;

    @Override
    public synchronized int next() {
        currentEvenValue++;
        //-- 第一个线程执行完第一行，就被挂起了。
//        Thread.yield(); 这个方法是，告诉别的线程，我已经执行完了。别的进程快点进来
        currentEvenValue++;
        return currentEvenValue;
    }

    public static void main(String[] args) {
//        EvenChecker.test(new SynchronizedGenerator());//同步控制 EvenGenertor
        EvenChecker.test(new MutexEvenGenertor());//使用显式的Lock对象
    }
}

/**
 * 使用显式的Lock对象
 */
class MutexEvenGenertor extends IntGenerator{
    private int currentEvenValue=0;

    private Lock lock=new ReentrantLock();//创建锁
    @Override
    public int next() {
        lock.lock();//加锁
        try{
            currentEvenValue++;
            //-- 第一个线程执行完第一行，就被挂起了。
            Thread.yield(); //这个方法是，告诉别的线程，我已经执行完了。别的进程快点进来
            currentEvenValue++;
            return currentEvenValue;
        }finally {
            lock.unlock();/*释放锁*/
        }

    }
}
