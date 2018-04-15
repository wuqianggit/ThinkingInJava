package arrays;

import org.junit.Test;

/**
 *
 * arrays
 *
 * 2018/4/11-20:51
 * 2018
 * Created by wuqiang on 2018/4/11.
 */
public class CharArray {

    public char c;
    /**
     * char 基本类型会默认初始化为什么？
     */
    @Test
    public void testCharArray(){
        CharArray charArray = new CharArray();
        System.out.println((int)charArray.c);
    }
}
