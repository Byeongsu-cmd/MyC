class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        int result = 0;
        
        for(int i = 0; i < numbers.length; i++){ // 리스트에 있는 값을 모두 꺼내어 합한다.
            sum += numbers[i];
        }
        
        for(int j = 0; j <= 9; j++){ // 0부터 9까지의 합을 구한다.
            result += j;
        }
        
        result -= sum; // result에 sum을 뺀 후 그 값을 다시 저장한다.
        return result;
    }
}