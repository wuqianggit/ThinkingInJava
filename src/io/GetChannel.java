package io;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 *
 * io
 * New I/O
 * 2018/4/18-21:44
 * 2018
 * Created by wuqiang on 2018/4/18.
 */
public class GetChannel {

    private static final int SIZE=1024;

    public static void main(String[] args) throws Exception {
        File file=new File("D:\\data.text");
        //写数据
        FileChannel fc=new FileOutputStream(file).getChannel();

        fc.write(ByteBuffer.wrap("Some text!".getBytes()));

        fc.close();
        //追加文件

        fc=new RandomAccessFile(file,"rw").getChannel();

        fc.position(fc.size());
        fc.write(ByteBuffer.wrap(" more text!".getBytes()));
        fc.close();

        //读整个文件

        fc=new FileInputStream(file).getChannel();
        ByteBuffer buff=ByteBuffer.allocate(SIZE);//
        fc.read(buff);
        buff.flip();//让缓冲器做好，让别人读取字节的准备。


    }
}
