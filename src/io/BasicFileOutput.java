package io;

import java.io.*;

/**
 *
 * io
 * 基本的文件输出。
 *
 * 2018/4/17-21:48
 * 2018
 * Created by wuqiang on 2018/4/17.
 */
public class BasicFileOutput {
    /**
     * 向文件写入数据
     * @param args
     */
    public static void main(String[] args) throws Exception {
        File fileOutParentDir=new File("D:\\fileOutTest");
        /**
         * 如果文件的父目录没有，则创建
         */
        if(!fileOutParentDir.exists()){
            fileOutParentDir.mkdirs();
        }

        File fileOut=new File(fileOutParentDir.getAbsolutePath(),"fielOut.out");
        /**
         * 开始写数据
         */
        BufferedWriter bw=new BufferedWriter(new FileWriter(fileOut));

        PrintWriter pw=new PrintWriter(bw);
        String str = BufferedInputFile.read(new File("D:\\test.txt"));
        pw.print(str);

        pw.close();

    }
}
