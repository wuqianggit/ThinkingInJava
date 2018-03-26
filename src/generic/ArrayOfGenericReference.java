package generic;

/**
 * 销售管理系统
 * generic
 * <p>
 * 2018/3/26-16:30
 * 科达科技股份有限公司-版权所有
 * Created by wuqiang on 16:30.
 */

class Generic<T>{

}

public class ArrayOfGenericReference {
    static Generic[] gen=new Generic[10];/*这么写可以*/

//    static Generic<Integer>[] gen2=new Generic<Integer>[10]; //这么写 会报编译错误。
}
