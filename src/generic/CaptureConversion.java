package generic;

/**
 * 销售管理系统
 * generic
 * 捕获转换
 *
 * 2018/3/27-18:08
 * 科达科技股份有限公司-版权所有
 * Created by wuqiang on 18:08.
 */
public class CaptureConversion {
    static <T> void f1(Holder<T> holder){
        T t = holder.get();
        System.out.println(t.getClass().getSimpleName());
    }

    static void f2(Holder<?> holder){
        /*类型会被捕获*/
        f1(holder);
    }

    public static void main(String[] args) {
        Holder raw=new Holder<Integer>(1);
        f1(raw);
        f2(raw);/*调用F2的过程中，类型会被捕获*/

    }
}
