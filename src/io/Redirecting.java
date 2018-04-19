package io;

import java.io.*;

/**
 *
 * io
 * 标准输入/输出流的重定向
 * 2018/4/18-21:08
 * 2018
 * Created by wuqiang on 2018/4/18.
 */
public class Redirecting {

    public static void main(String[] args) throws Exception {
        PrintStream console = System.out;

        BufferedInputStream in=new BufferedInputStream(new FileInputStream(new File("D:\\test.txt")));

        PrintStream out=new PrintStream(new BufferedOutputStream(new FileOutputStream(new File("D:\\test.out"))));
        //重定向 标准输入流
        System.setIn(in);
        //重定向 标准输出流
        System.setOut(out);

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=br.readLine())!=null){
            System.out.println(s);
        }

        out.close();

        System.setOut(console);

    }
}
