package resuing;

/**
 * 销售管理系统
 * resuing
 *
 * 2017/10/31-19:15
 * 2017科达科技股份有限公司-版权所有
 * Created by wuqiang on 2017/10/31.
 */
public class OverridingPrivate extends WithFinals {

    private final void f(){
        System.out.println(" OverridingPrivate.f()");
    }

    private void g(){
        System.out.println(" OverridingPrivate.g() ");
    }
    
}
