class 조이스틱 {
    public int solution(String name) {
        int answer = 0;

        // 1. 알파벳 변경 횟수
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            answer += Math.min(c - 'A', 'Z' - c + 1);
        }

        // 2. 커서 이동 최소화
        int move = name.length() - 1;
        for (int i = 0; i < name.length(); i++) {
            int next = i + 1;
            while (next < name.length() && name.charAt(next) == 'A') {
                next++;
            }

            // 양쪽 회전 모두 고려
            int leftTurn = i * 2 + (name.length() - next);
            int rightTurn = i + 2 * (name.length() - next);

            move = Math.min(move, Math.min(leftTurn, rightTurn));
        }

        return answer + move;
    }
}