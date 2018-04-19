package io;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

/**
 *
 * io
 * 转换数据
 * 2018/4/20-7:29
 * 2018
 * Created by wuqiang on 2018/4/20.
 */
public class BufferToText {

    private static final int SIZE=1024;
    public static void main(String[] args) throws Exception {
        //直接读取一个文件的数据
        File file=new File("D:\\test-GB2312.txt");
        FileChannel fc = new FileInputStream(file).getChannel();
        ByteBuffer bf=ByteBuffer.allocate(SIZE);
        fc.read(bf);
        bf.flip();
//        System.out.println(bf.asCharBuffer());
//        while(bf.hasRemaining()){
//            System.out.print((char) bf.get());//为什么UTF-8 还会乱码？
//        }

        String encoding = System.getProperty("file.encoding");//系统属性
        System.out.println(encoding);
        //将 bf中的字符串进行编码

        CharBuffer decode = Charset.forName("GB2312").decode(bf);//实际上是解码
        System.out.println(decode);
    }

    /**
     * 测试编码
     * @throws Exception
     */
    @Test
    public void testOutput() throws Exception{
        File file=new File("D:\\fileOut.txt");
        FileChannel fc = new FileOutputStream(file).getChannel();
        fc.write(ByteBuffer.wrap("我是中国人，I am chinese!".getBytes("UTF-8")));
        fc.close();


    }

    /**
     * 读取
     * @throws Exception
     */
    @Test
    public void testInput() throws Exception{
        File file=new File("D:\\fileOut.txt");
        FileChannel fc = new FileInputStream(file).getChannel();
        ByteBuffer bf = ByteBuffer.allocate(1024);
        fc.read(bf);
        bf.flip();
        System.out.println(bf.asCharBuffer());
    }
}
