package string.regularexpressions;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * string.regularexpressions
 * 字符串的处理
 * 2017/12/30-10:52
 * 2017
 * Created by wuqiang on 2017/12/30.
 */
public class StringTest {

    @Test
    public void testString(){
        String s="\\d";
        System.out.println(s);
    }

    /**
     * 测试正则表达式
     */
    @Test
    public void testRegularExpression(){
        String text="abc11";
        String regularExpression="\\d+";/*是否有一个或多个数字*/
        Pattern p = Pattern.compile(regularExpression);
        Matcher matcher = p.matcher(text);
        while(matcher.find()){
            System.out.println(matcher.start());
        }

        boolean matches = Pattern.matches(regularExpression, text);
        boolean matches1 = text.matches(regularExpression);
        System.out.println(matches+"---"+matches1);
    }
}
