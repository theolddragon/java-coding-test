import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 문자열_내림차순으로_배치하기_테스트 {

    @Test
    void solution_validation_lowerThen_test() {
        문자열_내림차순으로_배치하기 solution = new 문자열_내림차순으로_배치하기();
        String exceptionMessage = "문자의 길이는 1보다 크거나 같은 값이어야 합니다.";

        IllegalArgumentException illegalArgumentException1 = assertThrows(IllegalArgumentException.class, () -> {
            solution.solution("");
        });
        assertEquals(exceptionMessage, illegalArgumentException1.getMessage());


        IllegalArgumentException illegalArgumentException2 = assertThrows(IllegalArgumentException.class, () -> {
            solution.solution(null);
        });
        assertEquals(exceptionMessage, illegalArgumentException2.getMessage());
    }


    @Test
    void solution_test() {
        문자열_내림차순으로_배치하기 solution = new 문자열_내림차순으로_배치하기();
        assertEquals("gfedcbZ", solution.solution("Zbcdefg"));
    }
}