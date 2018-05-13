package concurrency;

/**
 *
 * concurrency
 * 不正确的访问资源
 *
 * 整数生成器，用于生成一个整数
 * 2018/4/25-20:44
 * 2018
 * Created by wuqiang on 2018/4/25.
 */
public abstract class IntGenerator {

    private volatile boolean canceled=false;/*是否被取消*/

    public abstract int next();/*用于生成整数*/

    public void cancel(){
        canceled=true;
    }

    public boolean isCanceled(){
        return canceled;
    }
}
