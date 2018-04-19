package io;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * io
 * 标准输入/输出
 * 2018/4/18-20:54
 * 2018
 * Created by wuqiang on 2018/4/18.
 */
public class Echo {

    public void main1(String[] args) throws IOException {
        BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=stdin.readLine())!=null){
            System.out.println(s);
        }
    }

    /**
     * 测试标准的输入流
     */
    public static void main(String[] args) throws IOException {
        InputStream in=System.in;
        int i;
        while((i=in.read())!=-1){
            System.out.println(i);
        }
    }
}
