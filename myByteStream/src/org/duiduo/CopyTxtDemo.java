package org.duiduo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTxtDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\duiduo\\窗里窗外.txt");
        FileOutputStream fos = new FileOutputStream("窗里窗外.txt");

        int by;
        while((by = fis.read()) != -1) {
            fos.write(by);
        }

        fos.close();
        fis.close();
    }
}
