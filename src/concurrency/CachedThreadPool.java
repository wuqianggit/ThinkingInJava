package concurrency;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * concurrency
 * 使用 Executor
 *
 * 使用Executor 代替moreBaseicThreaads。
 * CachedThreadPool，为每一个热雾都创建一个线程。
 * 2018/4/23-21:16
 * 2018
 * Created by wuqiang on 2018/4/23.
 */
public class CachedThreadPool {

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i=0;i<5;i++){
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }

    /**
     * 一次性 预先执行线程分配，限制线程数量
     */
    @Test
    public void testFixedThreadPool(){
        ExecutorService exec = Executors.newFixedThreadPool(2);/*为处理任务，总共分配两个线程*/
        for(int i=0;i<5;i++){
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }

    /**
     * 如果向SingleThradExecutor提交了多个任务，那么 这些任务将会排队执行。
     * 即为这些任务，仅分配1个线程。相当于数量为1 的 FixedThreadPool
     */
    @Test
    public void testSingleThreadExecutor(){
        ExecutorService exec = Executors.newSingleThreadExecutor();/*为处理任务，总共分配两个线程*/
        for(int i=0;i<5;i++){
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}
