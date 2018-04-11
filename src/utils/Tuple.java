package utils;

/**
 * 销售管理系统
 * utils
 * <p>
 * 2018/3/23-16:33
 * 科达科技股份有限公司-版权所有
 * Created by wuqiang on 16:33.
 */
public class Tuple {
    public static <A,B> TwoTuple<A,B> tuple(A a,B b){
        return new TwoTuple<A,B>(a,b);
    }

    public static <A,B,C> ThreeTuple<A,B,C> tuple(A a,B b,C c){
        return new ThreeTuple<A,B,C>(a,b,c);
    }
}
