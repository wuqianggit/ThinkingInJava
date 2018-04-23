package concurrency;

/**
 *
 * concurrency
 * 定义任务
 * 在main中，直接调用 Run任务，而不是由单独的线程驱动。
 * 2018/4/23-8:02
 * 2018
 * Created by wuqiang on 2018/4/23.
 */
public class MainThread {

    public static void main(String[] args) {
        LiftOff launch=new LiftOff();
        launch.run();/*与普通的类，没有什么区别，如果直接调用Run方法的话*/
    }
}
