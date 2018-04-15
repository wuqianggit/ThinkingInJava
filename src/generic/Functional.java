package generic;

import java.util.Iterator;

/**
 *
 * generic
 * 函数对象
 * 2018/4/10-21:44
 * 2018
 * Created by wuqiang on 2018/4/10.
 */

interface Combiner<T>{
    T combine(T x,T y);
}

interface UnaryFunction<R,T> {
    R funtion(T x);
}

interface Collector<T> extends UnaryFunction<T,T>{
    T result();
}

interface UnaryPredicate<T> {
    boolean test(T x);
}

public class Functional {
    public static <T> T reduce(Iterable<T> seq,Combiner<T> combiner){
        Iterator<T> iterator = seq.iterator();

        return combiner.combine(iterator.next(),iterator.next());
    }
}
