package org.duiduo;

public class DiGuiDemo02 {
    public static void main(String[] args) {
        System.out.println(jc(5));
    }

    public static int jc(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * jc(n - 1);
        }
    }
}
