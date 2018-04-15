package arrays;

import java.util.Arrays;

/**
 *
 * arrays
 * 复制数组
 * 2018/4/11-21:35
 * 2018
 * Created by wuqiang on 2018/4/11.
 */
public class CopyingArrays {

    public static void main(String[] args) {
        int[] i=new int[7];
        Arrays.fill(i,1);/*填充数组*/
        int[] j=new int[9];
        Arrays.fill(j,9);

        /**
         * 复制i数组到j数组
         * 如果是对象，则复制的是对象的引用，而不是对象的clone。
         *
         */
        System.arraycopy(i,0,j,0,1);

        System.out.println(Arrays.toString(i));
        System.out.println(Arrays.toString(j));
    }
}
