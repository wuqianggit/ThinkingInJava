package generic;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 *
 * generic
 * 将一个方法应用于序列
 *
 * 要创建一个Apply()方法，它能够将任何方法应用于某个序列的所有对象
 *
 * 疑问 ：是有一堆对象，没有方法，使用了apply()方法之后，这些对象就有 这个方法了？
 *
 * 解答：实际上不是的，是 一个集合里面的对象，都执行 一个方法。对象中的 方法个数是不变的，只是去执行一个大家都有的方法而已。
 * 2018/4/9-21:57
 * 2018
 * Created by wuqiang on 2018/4/9.
 */
public class Apply {
    public static <T,S extends Iterable<? extends T >> void apply(S seq,Method f,Object...args){
        try{
            for(T t:seq){
                f.invoke(t,args);
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {

    }
}

class Shape{
    public void rotate(){
        System.out.println(this+"rotate");
    }

    public void resize(int newSize){
        System.out.println(this+" resize"+newSize);
    }
}

class Square extends Shape{

}

class FilledList<T> extends ArrayList<T>{/*填充好的序列*/
    public FilledList(Class<? extends T> type,int size){
        try{
            for(int i=0;i<size;i++){
                add(type.newInstance());
            }
        }catch (Exception e){

        }
    }
}


