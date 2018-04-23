package utils;

import java.util.concurrent.ThreadFactory;

/**
 *
 * utils
 * 后台线程工厂
 * 2018/4/23-22:08
 * 2018
 * Created by wuqiang on 2018/4/23.
 */
public class DaemonThreadFactory implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        Thread t=new Thread(r);
        t.setDaemon(true);
        return t;
    }
}
