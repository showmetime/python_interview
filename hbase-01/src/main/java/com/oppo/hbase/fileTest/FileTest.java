package com.oppo.hbase.fileTest;

import java.io.*;

public class FileTest {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\ASUS\\Desktop\\game\\1.txt");
        try {
            if(!file.exists()){
                file.createNewFile();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileWriter  fileWriter = new FileWriter(file,true);
            fileWriter.write("这里是fileWriter写的啊啊啊啊你他妈的为什么不行\n操他爱吗的");
            fileWriter.flush();
            // 这里他妈的需要flush操他妈的
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
//            FileInputStream fileInputStream = new FileInputStream(file);

            FileOutputStream fileOutputStream = new FileOutputStream(file,true);
            //他妈的笔这个是加在这里都他妈的忘记了
            Writer writer =new  PrintWriter(fileOutputStream,true);
            try {
                writer.write("妈拉个巴子的，java写个文件怎么这么麻烦啊啊啊\n我看你是不是" +
                        "换行了 fuck");
                writer.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
    }
}
