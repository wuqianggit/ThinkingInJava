package generic;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 销售管理系统
 * generic
 * <p>
 * 2018/3/26-14:16
 * 科达科技股份有限公司-版权所有
 * Created by wuqiang on 14:16.
 */
public class ArrayMaker<T> {

    private Class<T> kind;

    public ArrayMaker(Class<T> kind){
        this.kind=kind;
    }

    public boolean f(Object o){
        return kind.isInstance(o);
    }

    public T create() throws IllegalAccessException, InstantiationException {
        return kind.newInstance();
    }

    T[] create(int size){
        return (T[]) Array.newInstance(kind,size);
    }

    public static void main(String[] args) {
        A[] o = (A[]) Array.newInstance(A.class, 10);
        System.out.println(Arrays.toString(o));
    }

}

class A{
    @Override
    public String toString(){
        return "a";
    }
}
