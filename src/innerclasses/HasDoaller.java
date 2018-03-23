package innerclasses;

/**
 * 销售管理系统
 * innerclasses
 *
 * 2017/11/23-19:37
 * 2017科达科技股份有限公司-版权所有
 * Created by wuqiang on 2017/11/23.
 */
public class HasDoaller {

    public static void main(String[] args) {
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
