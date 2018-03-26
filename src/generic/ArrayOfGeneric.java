package generic;

/**
 * 销售管理系统
 * generic
 * 泛型数组
 * 2018/3/26-16:35
 * 科达科技股份有限公司-版权所有
 * Created by wuqiang on 16:35.
 */
public class ArrayOfGeneric {
    static final int SIZE=100;
    static Generic<Integer>[] gia;

    public static void main(String[] args) {
        gia=(Generic<Integer>[])new Generic[SIZE];

        gia[0]=new Generic<Integer>();
    }
}
