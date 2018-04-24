package concurrency;

import org.junit.Test;

/**
 * 销售管理系统
 * concurrency
 * 加入一个线程
 * 演示如何加入一个线程的
 * 2018/4/24-18:58
 * 科达科技股份有限公司-版权所有
 * Created by wuqiang on 18:58.
 */

class Sleeper extends Thread{
    private int duration;/*持续时间*/

    public Sleeper(String name,int sleepTime) {
        super(name);
        this.duration = sleepTime;
        start();/*构造的时候，开启线程*/
    }

    @Override
    public void run() {
        try {
            System.out.println("Sleeper 开始执行了！开始睡"+duration+"ms!");
            sleep(duration);
            System.out.println("Sleeper 睡醒了！执行结束！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName()+" has awaked");
    }
}

class Joiner extends Thread{
    private Sleeper sleeper;/* 另外一个线程*/
    public Joiner(String name,Sleeper sleeper) {
        super(name);
        this.sleeper = sleeper;
        start();/*构造的时候，开启线程*/
    }

    @Override
    public void run() {
        try {
            System.out.println("Joiner 执行了，开始调用sleeper.join()！");
            sleeper.join();
            System.out.println("Joiner 结束了");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName()+" join completed!");
    }
}

public class Joinning {
    public static void main(String[] args) {
        Sleeper sleeper=new Sleeper("sleeper",1500);
                //grumpy=new Sleeper("grumpy",1500);
        Joiner dopey=new Joiner("dopey",sleeper);
                //doc=new Joiner("doc",grumpy);
        sleeper.interrupt();
        //grumpy.interrupt();
    }

    @Test
    public void testJoin(){
        Sleeper sleeper=new Sleeper("sleeper",1500);
        Joiner dopey=new Joiner("dopey",sleeper);
    }
}
