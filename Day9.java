public class LongestCommonPrefix {

    static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        System.out.println("Output: \"" + longestCommonPrefix(new String[]{"flower", "flow", "flight"}) + "\""); 

        System.out.println("Output: \"" + longestCommonPrefix(new String[]{"dog", "racecar", "car"}) + "\""); 

        System.out.println("Output: \"" + longestCommonPrefix(new String[]{"apple", "ape", "april"}) + "\""); 

        System.out.println("Output: \"" + longestCommonPrefix(new String[]{""}) + "\""); 

        System.out.println("Output: \"" + longestCommonPrefix(new String[]{"alone"}) + "\""); 

        System.out.println("Output: \"" + longestCommonPrefix(new String[]{}) + "\""); 
    }
}
