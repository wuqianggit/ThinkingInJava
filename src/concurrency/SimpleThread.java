package concurrency;

/**
 *
 * concurrency
 * 编码的变体
 * 2018/4/23-22:14
 * 2018
 * Created by wuqiang on 2018/4/23.
 */
public class SimpleThread extends Thread {
    private int countDown=5;

    private static int threadCount=0;

    public SimpleThread(){
        super(Integer.toString(++threadCount));
        start();
    }

    @Override public String toString() {
        return "SimpleThread{" + "countDown=" + countDown + '}';
    }

    @Override
    public void run() {
        while(true){
            System.out.println(this);
            if (--countDown>0) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        new SimpleThread();
    }
}
