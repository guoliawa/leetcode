package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WordPattern {
    public static boolean wordPattern(String pattern, String str) {
        if (pattern.length() != str.split(" ").length) {
            return false;
        }

        String[] words = str.split(" ");

        Map index = new HashMap();
        for (int i = 0; i < words.length; ++i) {
            if (!Objects.equals(index.put(pattern.charAt(i), i), index.put(words[i], i))) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String pattern = "abba";
        String str = "dog cat cat fish";
        System.out.println("The result is " + wordPattern(pattern, str));
    }
}
