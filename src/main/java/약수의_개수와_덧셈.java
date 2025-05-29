import java.util.stream.IntStream;

public class 약수의_개수와_덧셈 {
    public static final int MAX_NUMBER = 1_000;
    public static final int MIN_NUMBER = 1;

    public int solution(int left, int right) {
        if (left > MAX_NUMBER || right > MAX_NUMBER) {
            throw new IllegalArgumentException("정수는 1,000보다 작거나 같은 값이어야 합니다.");
        }
        if (left < MIN_NUMBER || right < MIN_NUMBER) {
            throw new IllegalArgumentException("정수는 1보다 크거나 같은 값이어야 합니다.");
        }
        if (left > right) {
            throw new IllegalArgumentException("left는 right보다 작거나 같은 값이어야 합니다.");
        }

        return IntStream.range(left, right + 1)
            .map(number -> {
                if (countDivisors(number) % 2 == 1) {
                    return number * -1;
                }

                return number;
            })
            .sum();
    }

    public int countDivisors(int number) {
        return (int) IntStream.range(1, number + 1)
            .filter(i -> number % i == 0)
            .count();
    }
}
