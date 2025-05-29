import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 저주의_숫자_3_테스트 {

    @Test
    void solution_test() {
        저주의_숫자_3 solution = new 저주의_숫자_3();
//        assertEquals(25, solution.solution(15));
//        assertEquals(76, solution.solution(40));
        assertEquals(120, solution.solution(100));
    }

}