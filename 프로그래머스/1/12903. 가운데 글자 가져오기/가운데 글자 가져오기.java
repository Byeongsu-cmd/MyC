class Solution {
    public String solution(String s) {
        String answer = "";
        
        if(s.length() % 2 == 0){
            int isEven = s.length() / 2 -1;
            answer = answer + s.charAt(isEven) + s.charAt(isEven + 1);
        } else {
            int isOdd = s.length() / 2;
            answer = answer + s.charAt(isOdd);
        }
        
        return answer;
    }
}