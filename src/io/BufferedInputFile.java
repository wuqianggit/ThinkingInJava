package io;

import java.io.*;

/**
 *
 * io
 * IO 流典型使用方式
 * 1 缓冲输入文件，即读取硬盘中的文本文件
 * 2018/4/16-21:37
 * 2018
 * Created by wuqiang on 2018/4/16.
 */
public class BufferedInputFile {

    public static String read(File file) throws Exception {
        BufferedReader br=new BufferedReader(new FileReader(file));
        String s="";
        StringBuilder sb=new StringBuilder();
        while((s=br.readLine())!=null){
            sb.append(s+"\n");
        }
        br.close();
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        File file=new File("D:\\test.txt");
        String read = read(file);
        System.out.println(read);
    }
}
