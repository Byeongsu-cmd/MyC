class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        int strLength = s.length();
        
        for(int i = 0; i < s.length(); i++){
            if((strLength == 4 || strLength == 6) && Character.isDigit(s.charAt(i))){
                answer = true;
            } else{
                answer = false;
                break;
            }
        }
        
        return answer;
    }
}