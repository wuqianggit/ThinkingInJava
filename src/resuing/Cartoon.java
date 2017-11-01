package resuing;

/**
 * 销售管理系统
 * resuing
 * 初始化基类
 * 2017/10/31-18:12
 * 2017科达科技股份有限公司-版权所有
 * Created by wuqiang on 2017/10/31.
 */

class Art{
    Art(){
        System.out.println(" Art ");
    }
}

class Drawing extends Art{
    Drawing(){
        System.out.println(" Drawing ");
    }
}


public class Cartoon extends Drawing{
    Cartoon(){
        System.out.println(" Cartoon ");
    }

    public static void main(String[] args) {
        Cartoon x=new Cartoon();
    }
}
