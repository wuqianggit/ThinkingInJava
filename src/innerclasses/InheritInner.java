package innerclasses;

/**
 * 销售管理系统
 * innerclasses
 *
 * 2017/11/22-15:53
 * 2017科达科技股份有限公司-版权所有
 * Created by wuqiang on 2017/11/22.
 */

class WithInner{
    class Inner{

    }
}

public class InheritInner extends WithInner.Inner{

    public InheritInner(WithInner wi) {
        wi.super();
    }

    public interface I{
        void f();
    }
    public void test(){
        new Thread(){
            /**
             * If this thread was constructed using a separate
             * <code>Runnable</code> run object, then that
             * <code>Runnable</code> object's <code>run</code> method is called;
             * otherwise, this method does nothing and returns.
             * <p>
             * Subclasses of <code>Thread</code> should override this method.
             *
             * @see     #start()
             * @see     #stop()
             * @see     #Thread(ThreadGroup, Runnable, String)
             */
            @Override public void run() {
                super.run();
            }
        }.start();
    }
}

class InnerInterfaceImpl implements InheritInner.I{

    @Override
    public void f() {

    }
}
