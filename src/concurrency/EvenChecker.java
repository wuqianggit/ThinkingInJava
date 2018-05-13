package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * concurrency
 * 不正确地访问资源
 *
 * 检查 使用生成器生成的数字，是否为整数
 * 2018/4/25-20:46
 * 2018
 * Created by wuqiang on 2018/4/25.
 */
public class EvenChecker implements Runnable{

    private IntGenerator generator;/*整数生成器*/
    private final int id;/*EvenChecker的id，用于区分不同的 EvenChecker对象*/

    public EvenChecker(IntGenerator g,int id){
        this.generator=g;
        this.id=id;
    }

    @Override
    public void run() {
        while(!generator.isCanceled()){
            int val = generator.next();
            if (val%2!=0) {
                System.out.println(val+" not even!");
                generator.cancel();
            }
        }
    }

    public static void test(IntGenerator g,int count){
        System.out.println("开始测试");
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i=0;i<count;i++){
            exec.execute(new EvenChecker(g,i));
        }
        exec.shutdown();/*停止*/
    }

    public static void test(IntGenerator generator){
        test(generator,10);/*默认10个线程*/
    }
}
