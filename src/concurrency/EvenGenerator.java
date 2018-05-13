package concurrency;

/**
 *
 * concurrency
 * 不正确地访问资源
 *
 * 偶数列生成器，调用Next方法，生成一个偶数数列，2、4、6、8...
 * 2018/4/25-20:53
 * 2018
 * Created by wuqiang on 2018/4/25.
 */
public class EvenGenerator extends IntGenerator {
    private int currentEvenValue=0;

    @Override
    public int next() {
        currentEvenValue++;
        //-- 第一个线程执行完第一行，就被挂起了。
        currentEvenValue++;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new EvenGenerator());
    }
}
