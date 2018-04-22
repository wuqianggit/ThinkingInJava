package io;

import org.junit.Test;
import utils.RandomUtil;

import java.io.*;
import java.util.Arrays;

/**
 *
 * io
 * 对象的序列化
 * 2018/4/21-10:51
 * 2018
 * Created by wuqiang on 2018/4/21.
 */

class Data implements Serializable {
    private int n;
    public Data(int n){
        this.n=n;
    }

    @Override
    public String toString() {
        return "Data{" + "n=" + n + '}';
    }
}

public class Worm implements Serializable{

    public static final File commonFile=new File("D:\\worm.obj");
    private Data[] d=new Data[]{
            new Data(RandomUtil.randNext(10)),
            new Data(RandomUtil.randNext(10)),
            new Data(RandomUtil.randNext(10))
    };


    @Override public String toString() {
        return "Worm{" + "d=" + Arrays.toString(d) + '}';
    }

    public static void main(String[] args) throws Exception {
        Worm m=new Worm();
        System.out.println(m);/*将这个对象，序列化到D:\\worm.obj文件中*/
        ObjectOutputStream out=null;
        try {
            out=new ObjectOutputStream(new FileOutputStream(commonFile));
            out.writeObject(m);
            out.writeObject("I love Gaoxj");
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(out!=null){
                out.close();
            }
        }
    }

    /**
     * 读取序列化文件
     */
    @Test
    public void readObj() throws Exception {
        ObjectInputStream in=null;
        try{
            in=new ObjectInputStream(new FileInputStream(commonFile));
            Worm o = (Worm) in.readObject();
            System.out.println(o);
            Object o2 = in.readObject();
            System.out.println(o2);
            
        }catch (Exception e){
            if(in!=null){
                in.close();
            }
        }
    }
}
