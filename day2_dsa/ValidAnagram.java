package day2_dsa;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        Map<Character,Integer> map = new HashMap<>();
        //check for all chars in s
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        //match with t
        for(char c: t.toCharArray()){
            if(!map.containsKey(c)){
                return false;
            }
            map.put(c,map.getOrDefault(c,0)-1);
            if(map.get(c)==0){
                map.remove(c);
            }
        }
        return map.isEmpty();
    }
    public static void main(String args[]){
        String s = "anagram";
        String t = "naagarm";
        System.out.println(isAnagram(s,t));
    }
}
