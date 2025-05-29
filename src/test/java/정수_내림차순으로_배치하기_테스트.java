import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 정수_내림차순으로_배치하기_테스트 {
    @Test
    void solution_validation_greaterThen_test() {
        String exceptionMessage = "정수는 8,000,000,000L보다 작거나 같은 값이어야 합니다.";

        IllegalArgumentException illegalArgumentException1 = assertThrows(IllegalArgumentException.class, () -> {
            정수_내림차순으로_배치하기 solution = new 정수_내림차순으로_배치하기();
            solution.solution(정수_내림차순으로_배치하기.MAX_NUMBER + 1);
        });
        assertEquals(exceptionMessage, illegalArgumentException1.getMessage());
    }

    @Test
    void solution_validation_lowerThen_test() {
        String exceptionMessage = "정수는 1보다 크거나 같은 값이어야 합니다.";

        IllegalArgumentException illegalArgumentException1 = assertThrows(IllegalArgumentException.class, () -> {
            정수_내림차순으로_배치하기 solution = new 정수_내림차순으로_배치하기();
            solution.solution(정수_내림차순으로_배치하기.MIN_NUMBER - 1);
        });
        assertEquals(exceptionMessage, illegalArgumentException1.getMessage());
    }

    @Test
    void solution_test() {
        정수_내림차순으로_배치하기 solution = new 정수_내림차순으로_배치하기();
        assertEquals(873211, solution.solution(118372));
    }
}