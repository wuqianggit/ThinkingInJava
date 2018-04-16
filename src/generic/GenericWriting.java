package generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 销售管理系统
 * generic
 * 超类型通配符
 * 2018/3/27-16:17
 * 科达科技股份有限公司-版权所有
 * Created by wuqiang on 16:17.
 */
public class GenericWriting {
    static <T> void writeExact(List<T> list, T item){
        list.add(item);
    }

    static List<Apple> apples=new ArrayList<Apple>();

    static List<Fruit> fruit=new ArrayList<Fruit>();

    static void f1(){
        writeExact(fruit,new Apple());
        writeExact(apples,new Apple());
    }

    public static void main(String[] args) {
        f1();
    }
}

