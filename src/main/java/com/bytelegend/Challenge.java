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
        int begin = 0;
        int end = str.length() - 1;
        int size = str.length() / 2;
        char[] chars = str.toCharArray();
        while (size > 0) {
            if (chars[begin] != chars[end]) {
                return false;
            }
            begin ++;
            end --;
            size --;
        }
        return true;
    }
}
