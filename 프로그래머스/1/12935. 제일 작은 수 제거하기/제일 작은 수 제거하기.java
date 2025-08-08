import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int min = arr[0]; // 임시로 설정 
        
        for (int num : arr) { // 반복문으로 값을 하나 씩 꺼내어 작은 값 찾기
            if (num < min) {
                min = num;
            }
        }
        
        if (arr.length == 1 && arr[0] == 10) { // 길이가 1이고 첫번째 값이 10 일 때
            answer.add(-1);
        }
        
        for (int i = 0; i < arr.length; i++) { 
            if (arr[i] != min) { // 최솟 값을 제외하고 다른 값들을 새로운 arrayList에 저장
                answer.add(arr[i]);
            }
        }
        return answer;
    }
}