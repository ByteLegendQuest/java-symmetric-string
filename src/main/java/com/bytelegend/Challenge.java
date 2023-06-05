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
        double mid;
        int length = str.length();
        if (length % 2 == 0) {
            mid = Math.floor(length / 2);
        } else {
            mid = Math.floor(length / 2) + 1;
        }

        int point1 = 0;
        double point2 = mid;
        while (point1 < mid && point2 < length) {
            if (str.charAt(point1) == str.charAt((int) point2)) {
                point1++;
                point2++;
            } else {
                return false;
            }
        }
        return true;
    }
}
