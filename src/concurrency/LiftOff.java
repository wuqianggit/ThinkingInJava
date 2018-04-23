package concurrency;

/**
 *
 * concurrency
 * 定义任务
 * liftoff  （火箭发射时）起飞，启动;
 * 2018/4/23-7:49
 * 2018
 * Created by wuqiang on 2018/4/23.
 */
public class LiftOff implements Runnable {

    protected int countDown=10;
    private static int taskCount;
    private final int id=taskCount++;/*用于 区分 任务的多个实例*/

    public LiftOff(){}
    public LiftOff(int countDown){/* 倒计时的构造方法，可以不用，默认是10 */
        this.countDown=countDown;
    }

    public String status(){/*火箭的状态 */
        return "#"+id+"("+(countDown>0?countDown:"Liftoff!")+"), ";
    }

    @Override
    public void run(){
        while(countDown-->0){
            System.out.print(status());/*显示火箭的状态*/
            /**
             * 调用这个方法，是对线程调度器的一种建议，
             * 它在声明“我已经执行完我的任务最重要的一部分了，此刻是给其他任务执行一段时间的打好时机”
             *
             * 注意：线程调度器，是Java线程机制的一部分，可以将CPU从一个线程，转移给另一个线程。
             */
            Thread.yield();
        }
    }

}
