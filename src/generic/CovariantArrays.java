package generic;

/**
 * 销售管理系统
 * generic
 * 通配符
 * 可以向导出类型的数组，赋予基本类型的数组引用
 * M:导出类型的数组是什么意思？
 * 2018/3/27-13:42
 * 科达科技股份有限公司-版权所有
 * Created by wuqiang on 13:42.
 */

class Fruit{}
class Apple extends Fruit{
    @Override
    public String toString() {
        return "Apple";
    }
}
class Jonathan extends Apple{}
class Orange extends Fruit{
    @Override
    public String toString() {
        return "Orange{}";
    }
}

public class CovariantArrays {

    public static void main(String[] args) {
        Fruit[] fruit=new Apple[10];/*父类型的数组*/

        fruit[0]=new Apple();
        fruit[1]=new Jonathan();/*当前数组是 apple类型*/

        fruit[0]=new Fruit();/* 运行会报错 java.lang.ArrayStoreException*/

        fruit[1]=new Orange();/*java.lang.ArrayStoreException*/

    }
}
