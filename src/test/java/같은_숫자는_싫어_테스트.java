import org.junit.jupiter.api.Test;

import java.security.SecureRandom;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class 같은_숫자는_싫어_테스트 {

    @Test
    void solution_validation_maxLength_test() {
        SecureRandom secureRandom = new SecureRandom();

        int[] parameter = IntStream.range(0, 같은_숫자는_싫어.MAX_ARRAY_LENGTH + 1)
                .map(index -> secureRandom.nextInt(9))
                .toArray();

        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> {
            같은_숫자는_싫어 solution = new 같은_숫자는_싫어();
            solution.solution(parameter);
        });
        assertEquals("배열의 크기는 1,000,000 이하입니다.", illegalArgumentException.getMessage());
    }

    @Test
    void solution_validation_greaterThenNine_test() {
        int[] parameter = { 같은_숫자는_싫어.MAX_ELEMENT_NUMBER + 1 };

        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> {
            같은_숫자는_싫어 solution = new 같은_숫자는_싫어();
            solution.solution(parameter);
        });
        assertEquals("배열의 원소의 크기는 9보다 작거나 작은 정수입니다.", illegalArgumentException.getMessage());
    }

    @Test
    void solution_validation_lowerThenZero_test() {
        int[] parameter = { 같은_숫자는_싫어.MIN_ELEMENT_NUMBER - 1 };

        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> {
            같은_숫자는_싫어 solution = new 같은_숫자는_싫어();
            solution.solution(parameter);
        });
        assertEquals("배열의 원소의 크기는 0보다 크거나 같은 정수입니다.", illegalArgumentException.getMessage());
    }

    @Test
    void solution_test() {
        같은_숫자는_싫어 solution = new 같은_숫자는_싫어();

        int[] parameter1 = { 1, 1, 3, 3, 0, 1, 1 };
        int[] result1 = { 1, 3, 0, 1 };
        assertArrayEquals(result1, solution.solution(parameter1));

        int[] parameter2 = { 4, 4, 4, 3, 3 };
        int[] result2 = { 4, 3 };
        assertArrayEquals(result2, solution.solution(parameter2));
    }
}