import java.util.Arrays;

/**
 * 销售管理系统
 * PACKAGE_NAME
 *
 * 2017/12/14-14:44
 * 2017科达科技股份有限公司-版权所有
 * Created by wuqiang on 2017/12/14.
 */
public class Test {

    static int i=1;

    static{
        i++;
    }

    public static void test(String ... strs){
        System.out.println(strs.length);
        if(strs.length==1){
            System.out.println(strs[0]);
        }else if(strs.length>1){
            System.out.println(Arrays.toString(strs));
        }
    }

    public static void main(String[] args) {
        test();
    }
}
