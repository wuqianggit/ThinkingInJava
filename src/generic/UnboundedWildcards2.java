package generic;

import java.util.HashMap;
import java.util.Map;

/**
 * 销售管理系统
 * generic
 * 说明了 无边界通配符的一个重要应用
 *
 * 当处理多个泛型参数时，有时允许一个参数可以是任何类型，同时为其他参数确定某种特定类型的这种能力 会显得很重要。
 * M：上面这句话没明白。
 *
 * 2018/3/27-16:31
 * 科达科技股份有限公司-版权所有
 * Created by wuqiang on 16:31.
 */
public class UnboundedWildcards2 {
    static Map map1;
    static Map<?,?> map2;/*使用了 无边界的通配符*/
    static Map<String,?> map3;

    static void assign1(Map map){
        map1=map;
    }
    static void assign2(Map<?,?> map){
        map2=map;
    }
    static void assign3(Map<String,?> map){
        map3=map;
    }

    public static void main(String[] args) {
        assign1(new HashMap());
        assign2(new HashMap());
        assign3(new HashMap());
        System.out.println("123");
    }
}
