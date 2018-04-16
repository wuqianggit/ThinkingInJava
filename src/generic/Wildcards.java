package generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 销售管理系统
 * generic
 * 编译器何时才会关注原生类型和涉及无界通配符的类型之间的差异？
 * 看这个实例
 * 2018/3/27-16:48
 * 科达科技股份有限公司-版权所有
 * Created by wuqiang on 16:48.
 */
public class Wildcards {
    static void rawArgs(Holder holder,Object arg){
        holder.set(arg);

        Object obj=holder.get();
    }
    static void unboundedArg(Holder<?> holder,Object obj){
//        holder.set(obj); //error
    }

    static void test(){
        List<? super Apple> applist=new ArrayList<Apple>();
        applist.add(new Apple());
        Apple apple = (Apple) applist.get(0);
    }
}
