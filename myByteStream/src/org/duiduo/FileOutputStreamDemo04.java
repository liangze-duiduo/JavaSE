package org.duiduo;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo04 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("fos.txt" );
            fos.write("hello".getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
