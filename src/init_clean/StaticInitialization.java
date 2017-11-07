package init_clean;

/**
 * 销售管理系统
 * init_clean
 * 静态数据初始化
 * 2017/11/1-11:21
 * 2017科达科技股份有限公司-版权所有
 * Created by wuqiang on 2017/11/1.
 */
/*
* 类的静态数据如何初始化？
* 静态数据优先初始化，而且每个类只会初始化一次
* */

class Bowl{
    Bowl(int marker){
        System.out.println("Bowl("+marker+")");
    }

    void f1(int marker){
        System.out.println("f1("+marker+")");
    }
}

class Table{
    static Bowl bowl1=new Bowl(1);
    Table(){
        System.out.println("table()");
        bowl2.f1(1);
    }

    void f2(int marker){
        System.out.println("f2("+marker+")");
    }
    static Bowl bowl2=new Bowl(2);
}

class Cupboard{
    Bowl bowl3=new Bowl(3);
    static Bowl bowl4=new Bowl(4);
    Cupboard(){
        System.out.println("Cupboard()");
        bowl4.f1(2);
    }
    void f3(int marker){
        System.out.println(" f3("+marker+")");
    }
    static Bowl bowl5=new Bowl(5);
}

class A{
    Bowl bowl1=new Bowl(1); /*非静态区域成员，在new对象的时候，会在构造方法之前 先成员变量初始化*/

    static Bowl bowl2=new Bowl(2); /*静态成员先 初始化，而且只会初始化一次*/

}

public class StaticInitialization {
    public static void main(String[] args) {

    }

    static Table table=new Table();
    static Cupboard cupboard=new Cupboard();
}
