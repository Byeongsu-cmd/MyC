import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String number = String.valueOf(n);
        char[] arr = number.toCharArray();
        
        Character[] arrNumber = new Character[arr.length];
        for(int i = 0; i<arrNumber.length; i++){
            arrNumber[i] = arr[i];
        }
        
        Arrays.sort(arrNumber, Collections.reverseOrder());
        number = "";
        
        for(int i = 0; i<arrNumber.length; i++){
            number += arrNumber[i];
        }
        
        return answer = Long.valueOf(number);
    }
}