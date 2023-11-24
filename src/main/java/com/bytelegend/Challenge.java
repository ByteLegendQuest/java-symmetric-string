package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(isSymmetric("1234"));
        System.out.println(isSymmetric("1234321"));
    }

    /**
     * `isSymmetric()` method determines whether a string is a symmetric string.
     *
     * <p>For example, the string "level", "ABCDCBA" is a symmetric string, "ABCD", "DCBA" is not a
     * symmetric string.
     *
     * <p>If the given string is a symmetric string, then return `true`; otherwise, return `false`.
     */
    public static boolean isSymmetric(String str) {
        if (str.isEmpty()) {
            return true;
        }
        int sta = 0;
        int fin = str.length() - 1;
        int mid = str.length() / 2;
        boolean flag = true;
        do {
            char ch1 = str.charAt(sta);
            char ch2 = str.charAt(fin);
            if (ch1 != ch2) {
                flag = false;
                break;
            }
            sta++;
            fin--;
        } while (sta < mid);
        return flag;
    }
}
