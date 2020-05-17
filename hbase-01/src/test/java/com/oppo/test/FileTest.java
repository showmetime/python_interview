package com.oppo.test;

import org.junit.Test;

import java.io.*;
import java.nio.file.Path;


public class FileTest {

    //现来io的写法把
    @Test
    public void readFile(){
        String path = "C:\\Users\\ASUS\\Desktop\\game";
        File file = new File(path);
        if(!file.exists()){
            file.mkdirs();//创建目录
        }
        String fileName = "1.txt";
        File file1 = new File(path,fileName);
        if(!file.exists()){
            try {
                file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file1);
            FileReader fileReader = new FileReader(file1);
            Reader reader = new BufferedReader(fileReader);
            String s = ((BufferedReader) reader).readLine();
            while(s!=null ){
                //这里他妈的不能使用"".equal(s)
                System.out.println(s);
                s = ((BufferedReader) reader).readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
