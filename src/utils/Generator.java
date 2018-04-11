package utils;

/**
 * 销售管理系统
 * utils
 * 生成器接口， 创建新的对象
 * <p>
 * 2018/3/23-16:16
 * 科达科技股份有限公司-版权所有
 * Created by wuqiang on 16:16.
 */
public interface Generator<T> {
    /**
     * 直接返回 一个对象
     * @return
     */
    T next();
}
