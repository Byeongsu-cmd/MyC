class Solution {
    public long solution(long num) {
        int answer = 0;
        int count = 0;
        
        while(num>1){
            if(count>500){
                return -1;
            }
            
            if(num%2 == 0){
                num = num/2;
            } else{
                num = num*3+1;
            }
            
            count++;
        }
        
        return answer = count;
    }
}