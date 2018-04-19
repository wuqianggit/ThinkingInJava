package utils;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * utils
 * 文件读写的实用工具
 * 2018/4/18-20:18
 * 2018
 * Created by wuqiang on 2018/4/18.
 */
public class TextFile extends ArrayList<String> {
    /**
     * 将文件读成字符串
     * @param filePath
     * @return
     */
    public static String read(String filePath){
        StringBuilder sb=new StringBuilder();
        BufferedReader in=null;
        try {
            in=new BufferedReader(new FileReader(new File(filePath)));
            String s="";
            while((s=in.readLine())!=null){
                sb.append(s+"\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(in!=null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return sb.toString();
    }

    /**
     * 写文件
     * @param fileName
     * @param text
     */
    public static void write(String fileName,String text){
        PrintWriter out=null;
        try {
            out=new PrintWriter(fileName);
            out.print(text);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(out!=null){
                out.close();
            }
        }
    }
}
