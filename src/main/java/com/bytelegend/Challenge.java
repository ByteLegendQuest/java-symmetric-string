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
        String firstPart, secondPart;
        int len = str.length();
        if (len % 2 = 0) {
            firstPart = str.substring(0, len/2 - 1);
            secondPart = str.substring(len/2, len - 1);
        } else {
            firstPart = str.substring(0, len/2 - 1);
            secondPart = str.substring(len/2 + 1, len - 1);
        }
        return firstPart.equals(secondPart);
    }
}
