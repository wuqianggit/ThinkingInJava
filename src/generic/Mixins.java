package generic;

import java.util.Date;

/**
 *
 * generic
 * 与接口混合
 * 2018/4/9-21:30
 * 2018
 * Created by wuqiang on 2018/4/9.
 */

interface TimeStamped{
    long getStamp();
}

class TimeStampImp implements TimeStamped{

    @Override public long getStamp() {
        return new Date().getTime();
    }
}

interface SerialNumbered {
    long getSrialNumber();
}

class SerialNumberdImp implements SerialNumbered{
    private static int count=1;
    @Override public long getSrialNumber() {
        return count++;
    }
}

/**
 * 这个类实际上是 混合类
 */
class Mixin implements TimeStamped,SerialNumbered{
    private TimeStamped timeStamp=new TimeStampImp();
    private SerialNumbered serialNumbered=new SerialNumberdImp();

    @Override
    public long getStamp() {
        return timeStamp.getStamp();
    }

    @Override
    public long getSrialNumber() {
        return serialNumbered.getSrialNumber();
    }
}

public class Mixins {
    public static void main(String[] args) {
        Mixin mixin=new Mixin();

        mixin.getSrialNumber();
        System.out.println(mixin.getSrialNumber());
    }
}
