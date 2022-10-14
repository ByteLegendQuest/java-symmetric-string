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
        System.out.println(str);
        boolean flag = true;
        byte[] c = str.getBytes();
        for (int i = 0; i < c.length; i++) {
            byte b1 = c[i];
            byte b2 = c[c.length - 1 - i];
            if (b1 != b2) {
                flag = false;
                break;
            }
        }

        return flag;
    }
}
