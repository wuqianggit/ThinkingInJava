package generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 销售管理系统
 * generic
 * 通配符
 * 2018/3/27-15:33
 * 科达科技股份有限公司-版权所有
 * Created by wuqiang on 15:33.
 */
public class GenericsAndCovariance {

    public static void main(String[] args) {
        List<? extends Fruit> flist=new ArrayList<Apple>();

//        flist.add(new Apple());//编译错误， 这个flist，不能添加任何类型的对象
        //flist只能获取数据，而不能添加数据
        flist=getAppleList();/*这个是容器 的类型，而不是容器持有的类型*/
        System.out.println(flist);
        Fruit f=flist.get(0);/*我们知道，容器中的类型，至少是一个Fruit类型*/

        flist=getOrangeList();
        System.out.println(flist);

    }

    public static List<Apple> getAppleList(){
        List<Apple> list=new ArrayList<Apple>();
        list.add(new Apple());
        return list;
    }

    public static List<Orange> getOrangeList(){
        List<Orange> list=new ArrayList<Orange>();
        list.add(new Orange());
        return list;
    }
}
