package resuing;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * 销售管理系统
 * resuing
 * Resuing Class
 * 2017/10/31-15:57
 * 2017科达科技股份有限公司-版权所有
 * Created by wuqiang on 2017/10/31.
 */
public class Cleanser {
    private String s="Cleanser";

    public void append(String a){
        s+=a;
    }

    public void dilute(){
        append(" dilute() ");
    }

    public void apply(){
        append(" apply() ");
    }

    public void scrub(){
        append(" scrub() ");
    }
    @Override
    public String toString(){
        return s;
    }

    public static void main(String[] args) {
        Cleanser x=new Cleanser();
        x.dilute();
        x.apply();
        System.out.println(x);


    }
}
