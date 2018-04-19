package io;

import java.io.*;

/**
 *
 * io
 *
 * 2018/4/17-22:05
 * 2018
 * Created by wuqiang on 2018/4/17.
 */
public class StoringAndRecoveringData {

    public static void main(String[] args) throws Exception {
        File file=new File("D:\\storing.bak");/*保存的数据*/

        DataOutputStream out=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));

        out.writeUTF("我喜欢高小姐");
        out.writeDouble(1.1);/*不是给人读的*/
        out.close();

        //取
        DataInputStream in=new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
        String s = in.readUTF();
        System.out.println(s);
        double d = in.readDouble();
        System.out.println(d);
    }
}
