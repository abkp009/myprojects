package com.abhi.spring.docker;

public class Solution {
    public static void main(String[] args) {
        //System.out.println(new Solution().mergeAlternately("abc", "pqr"));
        System.out.println(new Solution().mergeAlternately2("abc", "pqr"));
    }

    public String mergeAlternately2(String word1, String word2) {
        
        return "";
    }

    public String mergeAlternately(String word1, String word2) {
        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();
        char[] result = new char[charArray1.length + charArray2.length];
        int c = 0;
        int i = 0, j = 0;
        for (i = 0, j = 0; i < charArray1.length && j < charArray2.length; i++, j++) {
            result[c++] = charArray1[i];
            result[c++] = charArray2[j];
        }
        while (i < charArray1.length)
            result[c++] = charArray1[i++];
        while (j < charArray2.length)
            result[c++] = charArray2[j++];
        return new String(result);
    }
}
