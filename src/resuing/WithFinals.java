package resuing;

/**
 * 销售管理系统
 * resuing
 *
 * 2017/10/31-19:15
 * 2017科达科技股份有限公司-版权所有
 * Created by wuqiang on 2017/10/31.
 */
public class WithFinals {
    /*加不加 final 都差不多*/
    private final void f(){
        System.out.println(" WithFinals.f() ");
    }

    private void g(){
        System.out.println(" WithFinals.g() ");
    }
}
