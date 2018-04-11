package utils;

import java.util.ArrayList;
import java.util.List;

/**
 * 销售管理系统
 * utils
 * 包含创建容器对象的方法
 * 2018/3/23-16:07
 * 科达科技股份有限公司-版权所有
 * Created by wuqiang on 16:07.
 */
public class New {
    /**
     * 创建一个list
     * 可以避免 new 后面出现重复的代码
     * @param <T>
     * @return
     */
    public static <T> List<T> list(){
        return new ArrayList<T>();
    }
}
