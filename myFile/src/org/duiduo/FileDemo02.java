package org.duiduo;

import java.io.File;
import java.util.Arrays;
import java.util.Objects;

public class FileDemo02 {
    public static void main(String[] args) {
        File f = new File("java.txt");
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.exists());

        System.out.println(f.getAbsoluteFile());
        System.out.println(f.getPath());
        System.out.println(f.getName());

        System.out.println("--------");

        File f2 = new File("E:\\duiduo");
        Arrays.stream(Objects.requireNonNull(f2.list())).forEach(System.out::println);

        System.out.println("--------");

        Arrays.stream(Objects.requireNonNull(f2.listFiles())).forEach(System.out::println);
    }
}
