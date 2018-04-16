package utils;

import java.util.ArrayList;

/**
 *
 * utils
 *
 * 2018/4/12-21:16
 * 2018
 * Created by wuqiang on 2018/4/12.
 */
public class CollectionData<T> extends ArrayList<T> {

    public CollectionData(Generator<T> gen,int quantity){
        for(int i=0;i<quantity;i++){
            add(gen.next());
        }
    }

    /**
     * 返回一个集合
     * @param gen
     * @param quantity
     * @param <T>
     * @return
     */
    public static <T> CollectionData<T> list(Generator<T> gen,int quantity){
        return new CollectionData<T>(gen,quantity);
    }
}

