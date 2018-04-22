package io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 *
 * io
 * 使用zip压缩多个文件。
 * 将D盘中的 test1.txt，与test2.txt，压缩为 test.zip
 * 2018/4/20-22:13
 * 2018
 * Created by wuqiang on 2018/4/20.
 */
public class ZipCompress {
    public static void main(String[] args) throws Exception {
        ZipOutputStream zout=null;
        try{
            File sourceFile1=new File("D:\\test1.txt");
            File sourceFile2=new File("D:\\test2.txt");

            //要压缩的文件列表
            List<File> fileList=new ArrayList<File>();
            fileList.add(sourceFile1);
            fileList.add(sourceFile2);

            byte[] buff=new byte[1024];

            File outFile=new File("D:\\test.zip");
            zout=new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(outFile)));

            for(File file:fileList){
                int len;
                FileInputStream fis=new FileInputStream(file);
                zout.putNextEntry(new ZipEntry(file.getName()));
                while((len=fis.read(buff))!=-1){
                    zout.write(buff,0,len);
                }
                zout.closeEntry();
                fis.close();
            }
        }catch (Exception e){
            zout.close();
        }

    }
}
