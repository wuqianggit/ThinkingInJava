package utils;

/**
 * 销售管理系统
 * utils
 * 元组
 * 2018/3/23-16:31
 * 科达科技股份有限公司-版权所有
 * Created by wuqiang on 16:31.
 */
public class ThreeTuple<A,B,C> extends TwoTuple<A,B> {
    C c;
    public ThreeTuple(A a, B b,C c) {
        super(a, b);
        this.c=c;
    }
}
