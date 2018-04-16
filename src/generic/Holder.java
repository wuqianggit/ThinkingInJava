package generic;

/**
 * 销售管理系统
 * generic
 * <p>
 * 2018/3/27-16:45
 * 科达科技股份有限公司-版权所有
 * Created by wuqiang on 16:45.
 */
public class Holder<T> {
    private T value;
    public Holder(){}
    public Holder(T val){
        value=val;
    }

    public void set(T val){
        value=val;
    }
    public T get(){
        return value;
    }

    public boolean equals(Object obj){
        return value.equals(obj);
    }
}
