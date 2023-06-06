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
        char[] chars = str.toCharArray();
        int charLen = chars.length;
        for (int i = 0; i < charLen / 2; i++) {
            char left = chars[i];
            char right = chars[charLen - 1 - i];
            if (left != right) {
                return false;
            }
        }

        return true;
    }
}
