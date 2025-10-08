import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int m = commands.length;
        int[] answer = new int[m];

        for (int idx = 0; idx < m; idx++) {
            int i = commands[idx][0]; // 1-indexed
            int j = commands[idx][1]; // 1-indexed
            int k = commands[idx][2]; // 1-indexed

            // 자바 배열은 0-indexed, copyOfRange의 끝 인덱스는 "포함하지 않음"
            int[] slice = Arrays.copyOfRange(array, i - 1, j);
            Arrays.sort(slice);
            answer[idx] = slice[k - 1];
        }
        return answer;
    }
}