package utils;

import java.util.Random;

/**
 *
 * utils
 *
 * 2018/4/21-10:54
 * 2018
 * Created by wuqiang on 2018/4/21.
 */
public class RandomUtil {
    private static final Random rand=new Random(47);
    public static int randNext(){
        return rand.nextInt();
    }

    public static int randNext(int n){
        return rand.nextInt(n);
    }
}
