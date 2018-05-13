package concurrency;

/**
 *
 * concurrency
 * 临界区
 * 演示了如何把一个非保护类型的类，在其他类的保护和控制之下
 *
 * M:保护不保护是什么意思？保护的是什么？
 * M:应该是非线程安全的类
 * 2018/4/25-21:59
 * 2018
 * Created by wuqiang on 2018/4/25.
 */

class Pair{
    private int x,y;

    public Pair(int x,int y){
        this.x=x;
        this.y=y;
    }

    public Pair() {
        this(0,0);
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    @Override public String toString() {
        return "Pair{" + "x=" + x + ", y=" + y + '}';
    }

    public class PairValuesNotEqualException extends RuntimeException{
        public PairValuesNotEqualException() {
            super("Pair values not equal :"+Pair.this);
        }
    }
    public void checkState(){
        if (x!=y) {
            throw new RuntimeException("不相同");
        }
    }
}
public class CriticalSection {

}
