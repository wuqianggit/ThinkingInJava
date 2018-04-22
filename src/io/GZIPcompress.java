package io;

import java.io.*;
import java.util.zip.GZIPOutputStream;

/**
 *
 * io
 * 使用 GZIP进行简单压缩
 * 读取 D盘的test.txt，文件，并压缩为 test.gz文件
 * 2018/4/20-21:52
 * 2018
 * Created by wuqiang on 2018/4/20.
 */
public class GZIPcompress {
    public static void main(String[] args) throws Exception {
        File sourceFile=new File("D:\\test.txt");
        File outFile=new File("D:\\test.gz");
        BufferedInputStream in=new BufferedInputStream(new FileInputStream(sourceFile));/*读取文件*/

        GZIPOutputStream out=new GZIPOutputStream(new FileOutputStream(outFile));/*写出文件流*/
        byte[] buff=new byte[1024];
        int len;
        while((len=in.read(buff))!=-1){
            out.write(buff,0,len);
        }
        out.close();
        in.close();
    }
}
