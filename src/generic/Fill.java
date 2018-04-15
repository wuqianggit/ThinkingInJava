package generic;

import java.util.Collection;

/**
 *
 * generic
 * 创建一个参数化的方法fill()，它接受一个序列
 * 2018/4/10-21:25
 * 2018
 * Created by wuqiang on 2018/4/10.
 */
public class Fill {
    public static <T> void fill(Collection<T> collection,Class<? extends T> classToken,int size)
            throws IllegalAccessException, InstantiationException {
        for(int i=0;i<size;i++){
            collection.add(classToken.newInstance());
        }
    }
}

class Contract{

}