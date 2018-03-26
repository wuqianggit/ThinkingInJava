package generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 销售管理系统
 * generic
 * <p>
 * 2018/3/26-16:26
 * 科达科技股份有限公司-版权所有
 * Created by wuqiang on 16:26.
 */
public class ListOfGenerics<T> {

    private List<T> array=new ArrayList<T>();

    public void add(T t){
        array.add(t);
    }

    public T get(int index){
        return array.get(index);
    }
}
