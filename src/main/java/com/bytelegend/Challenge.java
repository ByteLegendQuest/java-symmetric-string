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
        StringBuilder sb = new StringBuilder(str);
        StringBuilder c = sb.reverse();
        boolean flag = true;
        for (int i = 0; i < c.length()/2; i++) {
            if (str.charAt(i) == c.charAt(i)) {
                flag =true;
            } else {
                flag = false;
            }
        }
        return flag;
    }
}
