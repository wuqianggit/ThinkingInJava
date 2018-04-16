package generic;

/**
 * 销售管理系统
 * generic
 * 泛型 的边界
 * 2018/3/26-16:52
 * 科达科技股份有限公司-版权所有
 * Created by wuqiang on 16:52.
 */

interface HasColur{
    java.awt.Color getColor();
}

class Colored<T extends HasColur>{/*设置的泛型的边界，是 HasColur的子类*/
    T item;
    Colored(T item){
        this.item=item;
    }
    T getItem(){
        return item;
    }
    java.awt.Color color(){
        return item.getColor();
    }
}

class Dimension{
    public int x,y,z;
}

class ColoredDimension<T extends Dimension & HasColur>{/*多边界的，使用子类就实现不了了*/
    T item;
    ColoredDimension(T item){
        this.item=item;
    }
    T getItem(){
        return item;
    }
}


public class BasicBounds {

}
