import org.junit.jupiter.api.Test;

import java.security.SecureRandom;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class 약수의_개수와_덧셈_테스트 {

    @Test
    void solution_validation_greaterThen_test() {
        String exceptionMessage = "정수는 1,000보다 작거나 같은 값이어야 합니다.";

        IllegalArgumentException illegalArgumentException1 = assertThrows(IllegalArgumentException.class, () -> {
            약수의_개수와_덧셈 solution = new 약수의_개수와_덧셈();
            solution.solution(1, 약수의_개수와_덧셈.MAX_NUMBER + 1);
        });
        assertEquals(exceptionMessage, illegalArgumentException1.getMessage());


        IllegalArgumentException illegalArgumentException2 = assertThrows(IllegalArgumentException.class, () -> {
            약수의_개수와_덧셈 solution = new 약수의_개수와_덧셈();
            solution.solution(약수의_개수와_덧셈.MAX_NUMBER + 1, 1);
        });
        assertEquals(exceptionMessage, illegalArgumentException2.getMessage());
    }

    @Test
    void solution_validation_lowerThen_test() {
        String exceptionMessage = "정수는 1보다 크거나 같은 값이어야 합니다.";

        IllegalArgumentException illegalArgumentException1 = assertThrows(IllegalArgumentException.class, () -> {
            약수의_개수와_덧셈 solution = new 약수의_개수와_덧셈();
            solution.solution(1, 약수의_개수와_덧셈.MIN_NUMBER - 1);
        });
        assertEquals(exceptionMessage, illegalArgumentException1.getMessage());


        IllegalArgumentException illegalArgumentException2 = assertThrows(IllegalArgumentException.class, () -> {
            약수의_개수와_덧셈 solution = new 약수의_개수와_덧셈();
            solution.solution(약수의_개수와_덧셈.MIN_NUMBER - 1, 1);
        });
        assertEquals(exceptionMessage, illegalArgumentException2.getMessage());
    }

    @Test
    void solution_validation_leftThenRight_test() {
        SecureRandom secureRandom = new SecureRandom();
        String exceptionMessage = "left는 right보다 작거나 같은 값이어야 합니다.";

        int left = secureRandom.nextInt(1000) + 1;
        int right = left - secureRandom.nextInt(left);
        IllegalArgumentException illegalArgumentException1 = assertThrows(IllegalArgumentException.class, () -> {
            약수의_개수와_덧셈 solution = new 약수의_개수와_덧셈();
            solution.solution(left, right);
        });
        assertEquals(exceptionMessage, illegalArgumentException1.getMessage());
    }

    @Test
    void countDivisors_test() {
        약수의_개수와_덧셈 solution = new 약수의_개수와_덧셈();
        assertEquals(2, solution.countDivisors(13));
        assertEquals(4, solution.countDivisors(14));
        assertEquals(4, solution.countDivisors(15));
        assertEquals(5, solution.countDivisors(16));
        assertEquals(2, solution.countDivisors(17));

        assertEquals(8, solution.countDivisors(24));
        assertEquals(3, solution.countDivisors(25));
        assertEquals(4, solution.countDivisors(26));
        assertEquals(4, solution.countDivisors(27));
    }

    @Test
    void solution_test() {
        약수의_개수와_덧셈 solution = new 약수의_개수와_덧셈();
        assertEquals(43, solution.solution(13, 17));
        assertEquals(52, solution.solution(24, 27));
    }
}