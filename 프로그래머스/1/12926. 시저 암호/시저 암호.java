class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            // 공백은 그대로
            if (c == ' ') {
                sb.append(' ');
                continue;
            }

            // 대문자 처리
            if (Character.isUpperCase(c)) {
                char shifted = (char) ((c - 'A' + n) % 26 + 'A');
                sb.append(shifted);
            }
            // 소문자 처리
            else if (Character.isLowerCase(c)) {
                char shifted = (char) ((c - 'a' + n) % 26 + 'a');
                sb.append(shifted);
            }
        }

        return sb.toString();
    }
}