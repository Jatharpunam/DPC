import java.util.*;

public class LongestSubstring {
    public static int lengthSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(c);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(lengthSubstring("abcabcbb")); 
        System.out.println(lengthSubstring("bbbbb"));    
        System.out.println(lengthSubstring("pwwkew"));   
        System.out.println(lengthSubstring("abcdefgh")); 
        System.out.println(lengthSubstring("a"));        
    }
}
