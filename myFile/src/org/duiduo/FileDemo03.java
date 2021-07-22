package org.duiduo;

import java.io.File;
import java.io.IOException;

public class FileDemo03 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("java.txt");
        System.out.println(f1.delete());

        File f2 = new File("E:\\duiduo\\java.txt");
        System.out.println(f2.delete());

        File f3 = new File("E:\\duiduo\\javaSE");
        System.out.println(f3.delete());

        File f4 = new File("E:\\duiduo\\JavaWEB");
        System.out.println(f4.delete());
    }
}
