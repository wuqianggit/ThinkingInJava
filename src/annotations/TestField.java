package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * annotations
 * 测试注解，用于什么地方
 * 2018/4/22-10:58
 * 2018
 * Created by wuqiang on 2018/4/22.
 */
@Target({ElementType.LOCAL_VARIABLE})/*用于 类，字段，方法，构造器*/
@Retention(RetentionPolicy.RUNTIME)
public @interface TestField {
}
