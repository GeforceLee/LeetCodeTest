package com.geforcelee.leetcode.i3;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        if (chars.length==0)
            return 0;
        int longest = 1;
        int left;
        int right;
        for (left = 0; left < chars.length; left++) {
            char c = chars[left];
            Map<Character, Boolean> map = new HashMap<Character, Boolean>();
            map.put(c,true);
            for (right = left+1; right < chars.length; right++) {
                char t = chars[right];
                if (map.get(t) == null){
                    longest = Math.max(longest,right-left+1);
                    map.put(t,true);
                }else {
                    break;
                }
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
