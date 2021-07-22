package org.duiduo;

import java.io.File;
import java.io.IOException;

public class FileDemo01 {
    public static void main(String[] args) throws IOException {
        // 创建文件
        File f1 = new File("E:\\duiduo\\java.txt");
        System.out.println(f1.createNewFile());
        System.out.println("--------");
        // 创建目录
        File f2 = new File("E:\\duiduo\\JavaSE");
        System.out.println(f2.mkdir());
        System.out.println("--------");
        // 创建多级目录
        File f3 = new File("E:\\duiduo\\JavaWEB\\HTML");
        System.out.println(f3.mkdirs());
        System.out.println("--------");
        //创建文件
        File f4 = new File("E:\\duiduo\\javase.txt");
        System.out.println(f4.createNewFile());
        System.out.println("--------");
    }
}
