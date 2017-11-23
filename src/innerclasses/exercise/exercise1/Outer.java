package innerclasses.exercise.exercise1;

/**
 * 销售管理系统
 * innerclasses.exercise.exercise1
 *
 * 2017/11/22-14:20
 * 2017科达科技股份有限公司-版权所有
 * Created by wuqiang on 2017/11/22.
 */
public class Outer {

    class Inner{

    }

    public Inner getInner(){
        return new Inner();
    }

    public static void main(String[] args) {
        Outer out=new Outer();
        Outer.Inner inner=out.getInner();

        out.new Inner();



    }
}
