package resuing;

/**
 * 销售管理系统
 * resuing
 * 确保正确的清理
 * 2017/10/31-18:40
 * 2017科达科技股份有限公司-版权所有
 * Created by wuqiang on 2017/10/31.
 */

class Shape{
    Shape(int i){
        System.out.println("Shape Cons");
    }

    void dispose(){
        System.out.println(" Shape dispose()");
    }
}

class Circle extends Shape{
    Circle(int i){
        super(i);
        System.out.println("Drawing Circle");
    }
    void dispose(){
        System.out.println(" erasing Circle");
        super.dispose();
    }
}



public class CADSystem {
}
