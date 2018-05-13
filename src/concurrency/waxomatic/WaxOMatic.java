package concurrency.waxomatic;

import java.util.concurrent.TimeUnit;

/**
 *
 * concurrency.waxomatic
 * WaxOMatic.java 有两个过程，
 * 一个是将蜡涂到Car上，
 * 一个是将car上的蜡抹掉。
 *
 * M:wax--蜡
 * 2018/4/27-21:47
 * 2018
 * Created by wuqiang on 2018/4/27.
 */

class Car{
    private boolean waxOn=false;//是否被涂上蜡

    public synchronized void waxed(){//涂上蜡
        waxOn=true;
        notifyAll();
    }

    public synchronized void buffed(){//把蜡去掉
        waxOn=false;
        notifyAll();
    }

    public synchronized void waitForWaxing() throws InterruptedException {
        while(waxOn==false){//如果没有被图上蜡，那就等待
            wait();
        }
    }

    public synchronized void waitForBuffing() throws InterruptedException {
        while (waxOn==true){//如果被涂上了蜡，那就等待。没有图上蜡，则不需要等待
            wait();
        }
    }
}

public class WaxOMatic implements Runnable{
    private Car car;

    public WaxOMatic(Car car) {
        this.car = car;
    }

    @Override public void run() {
        try {
            while (!Thread.interrupted()){
                car.waitForWaxing();
                System.out.println(" Wax off");
                TimeUnit.MILLISECONDS.sleep(1000);
                car.buffed();
            }
        }catch (InterruptedException e) {
            System.out.println("");
        }
        System.out.println("Ending Wax off task");
    }

}
