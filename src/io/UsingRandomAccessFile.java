package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 *
 * io
 * 读写随机访问文件
 * 2018/4/17-22:11
 * 2018
 * Created by wuqiang on 2018/4/17.
 */
public class UsingRandomAccessFile {
    public static void main(String[] args) throws Exception {
        File file=new File("D:\\rtest.data");//测试的文件
        /**
         * 写
         */
        RandomAccessFile rf=new RandomAccessFile(file,"rw");
        rf.writeUTF("我喜欢高小姐");
        rf.writeDouble(1.11);
        /**
         * 读
         */
        rf.close();
        rf=new RandomAccessFile(file,"r");
        String s = rf.readUTF();
        System.out.println(s);
        double v = rf.readDouble();
        System.out.println(v);

        rf.close();
    }
}
