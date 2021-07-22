package org.duiduo;

import java.io.File;

public class DiGuiDemo03 {
    public static void main(String[] args) {
        File srcFile = new File("E:\\BaiduNetdiskDownload");
        getAllFilePath(srcFile);
    }

    public static void getAllFilePath(File srcFile) {
        File[] fileArray = srcFile.listFiles();
        if (fileArray != null) {
            for (File file : fileArray) {
                if (file.isDirectory()) {
                    getAllFilePath(file);
                } else {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
