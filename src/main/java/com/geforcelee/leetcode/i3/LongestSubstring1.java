package com.geforcelee.leetcode.i3;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring1 {
    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();

        int longest = 0;
        int left = 0;
        int right;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (right = 0; right < chars.length;right++) {

            char t = chars[right];
            Integer index = map.get(t);
            if (index == null){
                longest = Math.max(longest,right-left+1);
                map.put(t,right);
            }else {
                for (int i = left; i <index ; i++) {
                    char temp = chars[i];
                    map.put(temp,null);
                }
                map.put(t,right);
                left = index+1;
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("b"));
        System.out.println(lengthOfLongestSubstring(""));
        System.out.println(lengthOfLongestSubstring("bbtablud"));
    }
}
