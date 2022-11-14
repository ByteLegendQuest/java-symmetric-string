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
        if (str == null) {
            return false;
        }
        int len = str.length();
        if (len == 0 || len == 1) {
            return true;
        }
        int left = 0, right = len - 1;
        while (left < right) {
            if (str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
