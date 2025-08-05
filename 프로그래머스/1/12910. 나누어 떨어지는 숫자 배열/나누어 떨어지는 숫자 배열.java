import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> number = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                number.add(arr[i]);
            } 
        }
        if(number.isEmpty()) number.add(-1);
        
        answer = number.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}