public class 저주의_숫자_3 {
    public int solution(int n) {
        if (n < 1 || n > 100) {
            throw new IllegalArgumentException();
        }

        int answer = 0;
        for (int i=1; i<=n; i++) {
            answer += 1;
            answer = removeThree(answer);
            System.out.println(i + ", " + answer);
        }
        return answer;
    }

    private int removeThree(int value) {
        if (value % 3 == 0) {
            value += 1;
            return removeThree(value);
        }

        if (value % 10 == 3) {
            value += 1;
            return removeThree(value);
        }

        if (value / 10 == 3 || value / 10 == 13) {
            value += 1;
            return removeThree(value);
        }

        return value;
    }
}
