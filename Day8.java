public class ReverseWords {

    static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        
        String result = "";
        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i];
            if (i > 0) result += " ";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Output: \"" + reverseWords("the sky is blue") + "\"");  

        System.out.println("Output: \"" + reverseWords("  hello world  ") + "\"");  

        System.out.println("Output: \"" + reverseWords("a good   example") + "\"");  

        System.out.println("Output: \"" + reverseWords("    ") + "\"");  

        System.out.println("Output: \"" + reverseWords("word") + "\"");  
    }
}
