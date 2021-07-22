package org.duiduo;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("fos.txt");

        byte[] bys = new byte[1024];

        /*int len = fis.read(bys);
        System.out.println(new String(bys, 0 ,len));

        len = fis.read(bys);
        System.out.println(new String(bys, 0 ,len));

        len = fis.read(bys);
        System.out.println(new String(bys, 0 ,len));*/

        int len;
        while ((len = fis.read(bys)) != -1) {
            System.out.println(new String(bys, 0 , len));
        }

        fis.close();
    }
}
