package concurrency;

import java.io.IOException;

/**
 *
 * concurrency
 * 创建有响应的用户界面
 * 2018/4/24-21:12
 * 2018
 * Created by wuqiang on 2018/4/24.
 */

class UnresponsiveUI{
    private double d=1;
    public UnresponsiveUI() throws IOException {
        while(d>0){
            d=d+(Math.PI+Math.E)/d;
        }
        System.in.read();
    }
}

public class ResponsiveUI extends Thread{
    private static double d=1;

    public ResponsiveUI(){
        setDaemon(true);/*设置为后台线程*/
        start();
    }
    @Override
    public void run() {/*后台一直在计算*/
        while(true){
            d=d+(Math.PI+Math.E)/d;
        }
    }

    public static void main(String[] args) throws IOException {
        new ResponsiveUI();
        System.in.read();
        System.out.println(d);
    }
}
