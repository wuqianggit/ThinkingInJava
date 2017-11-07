package polymorphism;

/**
 * 销售管理系统
 * polymorphism
 * 域与 静态方法
 * 2017/11/1-14:48
 * 2017科达科技股份有限公司-版权所有
 * Created by wuqiang on 2017/11/1.
 */

class Super{
    public int field=0;
    public int getField(){
        return field;
    }
}

class Sub extends Super{
    public int field=1;
    public int getField(){
        return field;
    }
    public int getSuperField(){
        return super.getField();
    }
}

public class FieldAccess {
    public static void main(String[] args) {
        Super sup=new Sub();
        System.out.println("sup.field="+sup.field+" sup.getField="+sup.getField());
    }
}
