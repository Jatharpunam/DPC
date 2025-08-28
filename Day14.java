import java.util.*;

public class CountKDistinct {
    public static int countK(String s, int k) {
        return atMostK(s, k) - atMostK(s, k - 1);
    }

    private static int atMostK(String s, int k) {
        if (k == 0) return 0;

        int left = 0, result = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);

            while (map.size() > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) map.remove(leftChar);
                left++;
            }

            result += right - left + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countK("pqpqs", 2));       
        System.out.println(countK("aabacbebebe", 3)); 
        System.out.println(countK("a", 1));           
        System.out.println(countK("abc", 3));         
        System.out.println(countK("abc", 2));         
    }
}
