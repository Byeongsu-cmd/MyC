import java.util.*;

class Solution {
    public String solution(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        
        StringBuilder str = new StringBuilder(new String(charArray)).reverse();
        
        return str.toString();
    }
}