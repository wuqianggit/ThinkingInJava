package arrays;

/**
 *
 * arrays
 * 对象的比较
 * 2018/4/11-21:49
 * 2018
 * Created by wuqiang on 2018/4/11.
 */
public class CompType implements Comparable<CompType> {

    int i;
    int j;

    public CompType(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public int compareTo(CompType o) {
        if(i<o.i){
            return -1;
        }
        if(i==o.i){
            return 0;
        }
        return 1;
    }
}
