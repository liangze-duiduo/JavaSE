package org.duiduo;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("fos.txt");

//        fos.write(97);
//        fos.write(98);
//        fos.write(99);
//        fos.write(100);
//        fos.write(101);

//        byte[] bys = {97, 98, 99, 100, 101};
        byte[] bys = "abcde".getBytes();
//        fos.write(bys);

        fos.write(bys, 0, bys.length);
        fos.write(bys, 1, 3);

        fos.close();
    }
}
