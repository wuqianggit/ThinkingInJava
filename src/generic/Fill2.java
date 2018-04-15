package generic;

/**
 *
 * generic
 *
 * 2018/4/10-21:33
 * 2018
 * Created by wuqiang on 2018/4/10.
 */

interface Addable<T>{
    void add(T t);
}

public class Fill2 {
    public static <T> void fill(Addable<T> addable,Class<? extends T> classToken,int size)
            throws IllegalAccessException, InstantiationException {
        for(int i=0;i<size;i++){
            addable.add(classToken.newInstance());
        }
    }


 }
