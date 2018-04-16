package io;

import java.io.File;

/**
 *
 * io
 * 目录的检查及创建
 * 2018/4/15-21:01
 * 2018
 * Created by wuqiang on 2018/4/15.
 */
public class MakeDirectories {

    public static void main(String[] args) {
        File file=new File("D:\\wq\\gaoxiaojie\\loveStory.txt");
        /**
         * 如果文件不存在，则创建
         */
        if(!file.exists()){
            file.mkdirs();/*mkdirs会创建完整的文件路径*/
        }

        File newFile=new File("D:\\wq\\loveStory2.txt");
        /**
         * 将 D:\wq\gaoxiaojie\loveStory.txt 文件 loveStory.txt，
         * 移动到 D:\wq\loveStory.txt
         */
        file.renameTo(newFile);
    }
}
