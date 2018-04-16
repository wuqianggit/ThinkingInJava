package generic;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * generic
 *
 * 2018/4/10-21:31
 * 2018
 * Created by wuqiang on 2018/4/10.
 */
public class SimpleQueue<T> implements Iterable<T> {
    private LinkedList<T> storage=new LinkedList<T>();
    public void add(T t){
        storage.offer(t);
    }

    @Override
    public Iterator<T> iterator() {
        return storage.iterator();
    }
}
