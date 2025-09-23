class Solution {
    public int solution(int a, int b, int n) {
        int result = 0;

        while (n >= a) {
            int newCola = (n / a) * b;   // 새로 받는 콜라 수
            result += newCola;           // 총 콜라 개수 누적
            n = (n % a) + newCola;       // 남은 빈 병 + 새 콜라 마신 후 빈 병
        }

        return result;
    }
}