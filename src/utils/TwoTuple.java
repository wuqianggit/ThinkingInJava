package utils;

/**
 * 销售管理系统
 *  工具类
 * utils
 * 二元组
 * 2018/3/22-15:50
 * 科达科技股份有限公司-版权所有
 * Created by wuqiang on 15:50.
 */
public class TwoTuple<A,B> {
    public final A a;
    public final B b;
    public TwoTuple(A a,B b){
        this.a=a;
        this.b=b;
    }
    @Override
    public String toString(){
        return "("+a+"+"+b+")";
    }
}
