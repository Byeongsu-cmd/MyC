class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int total = 0;
        int number = x;
        
        while(x>0){
            total += x % 10;
            x/=10;
        }
        
        answer = (number % total == 0);
        return answer;
    }
}