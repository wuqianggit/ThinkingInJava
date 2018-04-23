package concurrency;

import annotations.TestField;
import org.junit.Test;

/**
 *
 * concurrency
 * Thread类
 *
 * 2018/4/23-8:11
 * 2018
 * Created by wuqiang on 2018/4/23.
 */
public class BasicThreads {

    public static void main(String[] args) {
        Thread t=new Thread(new LiftOff());/*使用 Thread*/
        t.start();
        System.out.println("Waiting for LiftOff");
    }

    /**
     * 添加更多的线程， 看所有任务，彼此之间是如何相互呼应的。
     */
    @Test
    public void moreBaseicThreaads(){
        for(int i=0;i<5;i++){
            new Thread(new LiftOff()).start();
        }
        System.out.println("Waiting for LiftOff");
    }
}
