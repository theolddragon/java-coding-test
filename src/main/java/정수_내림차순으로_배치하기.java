import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 정수_내림차순으로_배치하기 {
    public static final long MAX_NUMBER = 8_000_000_000L;
    public static final long MIN_NUMBER = 1L;

    public long solution(long n) {
        if (n > MAX_NUMBER) {
            throw new IllegalArgumentException("정수는 8,000,000,000L보다 작거나 같은 값이어야 합니다.");
        }
        if (n < MIN_NUMBER) {
            throw new IllegalArgumentException("정수는 1보다 크거나 같은 값이어야 합니다.");
        }

        String reverseResult = Stream.of(String.valueOf(n).split(""))
                .sorted(Collections.reverseOrder())
                .collect(Collectors.joining(""));

        return Long.parseLong(reverseResult);
    }
}
