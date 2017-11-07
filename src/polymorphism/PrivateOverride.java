package polymorphism;

/**
 * 销售管理系统
 * polymorphism
 * 覆盖私有方法
 * 2017/11/1-13:18
 * 2017科达科技股份有限公司-版权所有
 * Created by wuqiang on 2017/11/1.
 */
public class PrivateOverride {

    private void f(){
        System.out.println(" private f()");
    }

    public static void main(String[] args) {
        PrivateOverride p=new Derived();
        p.f();
    }
}

class Derived extends PrivateOverride{
    /*这是一个新的方法 */
    public void f(){
        System.out.println(" public f() ");
    }
}