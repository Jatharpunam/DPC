import java.util.*;

public class StringPermutations {
    public static List<String> permute(String s) {
        List<String> result = new ArrayList<>();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        boolean[] used = new boolean[chars.length];
        backtrack(chars, new StringBuilder(), used, result);
        return result;
    }

    private static void backtrack(char[] chars, StringBuilder current, boolean[] used, List<String> result) {
        if (current.length() == chars.length) {
            result.add(current.toString());
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            if (used[i]) continue;

            if (i > 0 && chars[i] == chars[i - 1] && !used[i - 1]) continue;

            used[i] = true;
            current.append(chars[i]);

            backtrack(chars, current, used, result);

            current.deleteCharAt(current.length() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        // Test Case 1
        System.out.println("Permutations of \"abc\": " + permute("abc"));

        // Test Case 2
        System.out.println("Permutations of \"aab\": " + permute("aab"));

        // Test Case 3
        System.out.println("Permutations of \"aaa\": " + permute("aaa"));

        // Test Case 4
        System.out.println("Permutations of \"a\": " + permute("a"));

        // Test Case 5
        System.out.println("Permutations of \"abcd\": " + permute("abcd"));
    }
}
