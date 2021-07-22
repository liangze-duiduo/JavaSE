package org.duiduo;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("fos.txt");
        fos.write(97);
//        fos.write(57);
//        fos.write(55);
        fos.close();
    }
}
