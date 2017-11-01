package resuing;

/**
 * 销售管理系统
 * resuing
 *
 * 2017/10/31-16:26
 * 2017科达科技股份有限公司-版权所有
 * Created by wuqiang on 2017/10/31.
 */
public class Detergent extends Cleanser {
    //Change a method
    @Override
    public void scrub() {
        append(" Detergent.scrub() ");
        super.scrub();
    }

    public void foam(){
        append(" foam() ");
    }

    public static void main(String[] args) {
        Detergent x=new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser.main(args);
    }
}
