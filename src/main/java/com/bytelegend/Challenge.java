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
        int x = 0;
        int y = str.length() - 1;
        char[] ch = str.toCharArray();
        while (ch[x++] == ch[y--]) {
            if (ch[x] != ch[y]) {
                return false;
            } else if (x >= y) {
                return true;
            }
        }
        return false;
    }
}
