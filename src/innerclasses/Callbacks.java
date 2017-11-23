package innerclasses;

/**
 * 销售管理系统
 * innerclasses
 * 闭包 与 回调
 * 2017/11/22-15:34
 * 2017科达科技股份有限公司-版权所有
 * Created by wuqiang on 2017/11/22.
 */

interface Incrementable{
    void increment();
}

class Callee1 implements Incrementable{
    @Override
    public void increment() {

    }
}

/**
 * 这个类我也不知道是什么意思
 */
class MyIncrement{
    public void increment(){
        System.out.println("Other operation");
    }
    static void f(MyIncrement mi){
        mi.increment();
    }
}

class Callee2 extends MyIncrement{
    private int i=0;
    public void increment(){
        super.increment();
        i++;
        System.out.println(i);
    }

    private class Closure implements Incrementable{
        @Override
        public void increment() {
            Callee2.this.increment();
        }
    }

    Incrementable getCallbackReference(){
        return new Closure();
    }
}

class Caller{
    private Incrementable callbackReference;
    Caller(Incrementable cbh){
        callbackReference=cbh;
    }
    void go(){
        callbackReference.increment();
    }
}

public class Callbacks {


}
