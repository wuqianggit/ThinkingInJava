package concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * concurrency
 * 装饰性花园
 *
 * 功能示例：花园委员会 希望 了解 每天进入公园的总人数。
 * M:公园有可能有多个门，每个大门有个计数器，只要大门上的计数器增加了，就表示公园中的总人数增加了
 * 2018/4/26-21:27
 * 2018
 * Created by wuqiang on 2018/4/26.
 */

class Count{
    private int count=0;

    private Random rand=new Random(47);//产生一个随机值

    public synchronized int increment(){//增加的方法
        int temp=count;
        if(rand.nextBoolean()){
            Thread.yield();//?,都放在同步方法中了，这个还有意义吗？
        }
        return count=++temp;
    }

    public synchronized int value(){//返回数值
        return count;
    }
}

class Entrance implements Runnable{
    private static Count count=new Count();

    private static List<Entrance> entrances=new ArrayList<Entrance>();

    private int number=0;

    private final int id;

//    private static volatile boolean canceled=false;
    private static volatile boolean canceled=false;
    public static void cancel(){
        canceled=true;
    }

    public Entrance(int id) {
        this.id = id;
        entrances.add(this);
    }

    @Override
    public void run() {
        while(!canceled){//如果没有取消，则增加
            synchronized (this){
                number++;
            }
            System.out.println(this+" Total: "+count.increment());//公园里所有的值
        }
        try {
            TimeUnit.MILLISECONDS.sleep(100);//睡100ms
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Stopping "+this);
    }

    public synchronized int getValue(){
        return number;
    }

    @Override public String toString() {
        return "Entrance{" + "id=" + id + '}';
    }

    public static int getTotalCount(){/*获取公园中所有的值*/
        return count.value();
    }

    public static int sumEntrance(){/*这个方法与  getTotalCount 有什么不同吗？*/
        int sum=0;
        for(Entrance entrance:entrances){
            sum+=entrance.getValue();
        }
        return sum;
    }
}

public class OrnamentalGarden {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i=0;i<5;i++){
            exec.execute(new Entrance(i));//开始执行任务
        }
        TimeUnit.SECONDS.sleep(3);
        Entrance.cancel();

        exec.shutdown();
        /**
         * 等待每个任务结束，如果所有任务在超时时间达到之前全部结束，则返回true，否则返回false
         *
         * M:经过验证，无论我等待多长时间，它都会返回false，即
         */
        if(!exec.awaitTermination(5000,TimeUnit.MICROSECONDS)){
            System.out.println("Some tasks were not terminated!");
        }

        System.out.println("Total :"+Entrance.getTotalCount());
        System.out.println("Sum of Entrances :"+Entrance.sumEntrance());
    }
}
