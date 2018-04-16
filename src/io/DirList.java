package io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

/**
 *
 * io
 * 想查看一个目录列表
 * 2018/4/15-20:24
 * 2018
 * Created by wuqiang on 2018/4/15.
 */
public class DirList {
    public static void main(String[] args) {
        File path=new File(".");
        System.out.println(path.getName());
        String[] list = path.list();/*这个列表，显示了 path目录下的所有 文件*/
        System.out.println(Arrays.toString(list));

        /**
         * 显示指定文件后缀的文件
         */
        list=path.list(new JavaDirFileter());
        System.out.println(Arrays.toString(list));

    }
}

class JavaDirFileter implements FilenameFilter{
    @Override
    public boolean accept(File dir, String name) {
        String[] fileNames=dir.getName().split(".");
        String fileName=fileNames[fileNames.length-1];

        if("java".equals(fileName)){
            return true;
        }
        return false;
    }
}