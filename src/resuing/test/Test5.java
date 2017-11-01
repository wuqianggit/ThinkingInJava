package resuing.test;

/**
 * 销售管理系统
 * resuing.test
 *
 * 2017/10/31-18:19
 * 2017科达科技股份有限公司-版权所有
 * Created by wuqiang on 2017/10/31.
 */
class A extends C{

}

class B{

}

class C{
    B b=new B();
}

public class Test5 {

    public static void main(String[] args) {
        C c=new C();
    }
}
