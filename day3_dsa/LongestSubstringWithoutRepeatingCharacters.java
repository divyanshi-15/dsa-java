package day3_dsa;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> uniqueChar = new HashSet<>();
        int left = 0;
        int right;
        int maxLength = 0;
        for(right = 0; right < s.length(); right++){
            while(uniqueChar.contains(s.charAt(right))){
                uniqueChar.remove(s.charAt(left));
                left ++;
            }
            uniqueChar.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left +1);
        }
        return maxLength;
    }
    public static void main(String args[]){
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
