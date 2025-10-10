class Solution {
    public String solution(int a, int b) {
        int[] monthDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        // 1월 1일부터 a월 b일까지의 총 일수 계산
        int totalDays = 0;
        for (int i = 0; i < a - 1; i++) {
            totalDays += monthDays[i];
        }
        totalDays += b;
        
        // 요일 계산
        String answer = days[(totalDays - 1) % 7];
        return answer;
    }
}