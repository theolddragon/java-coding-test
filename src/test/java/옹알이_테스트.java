import org.junit.jupiter.api.Test;

import java.security.SecureRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class 옹알이_테스트 {

    @Test
    void solution_validation_arrayLength_test() {
        옹알이 solution = new 옹알이();

        IllegalArgumentException illegalArgumentException1 = assertThrows(IllegalArgumentException.class, () -> {
            int arrayLength = 옹알이.MIN_ARRAY_LENGTH - 1;
            String[] babbling = generateStringArray(arrayLength, 옹알이.MAX_STRING_LENGTH);
            solution.solution(babbling);
        });
        assertEquals(옹알이.ERROR_MESSAGE_ARRAY_LENGTH, illegalArgumentException1.getMessage());

        IllegalArgumentException illegalArgumentException2 = assertThrows(IllegalArgumentException.class, () -> {
            int arrayLength = 옹알이.MAX_ARRAY_LENGTH + 1;
            String[] babbling = generateStringArray(arrayLength, 옹알이.MAX_STRING_LENGTH);
            solution.solution(babbling);
        });
        assertEquals(옹알이.ERROR_MESSAGE_ARRAY_LENGTH, illegalArgumentException2.getMessage());
    }

    @Test
    void solution_validation_stringLength_test() {
        옹알이 solution = new 옹알이();

        IllegalArgumentException illegalArgumentException1 = assertThrows(IllegalArgumentException.class, () -> {
            int arrayLength = 옹알이.MAX_ARRAY_LENGTH;
            String[] babbling = generateStringArray(arrayLength, 옹알이.MIN_STRING_LENGTH - 1);
            solution.solution(babbling);
        });
        assertEquals(옹알이.ERROR_MESSAGE_STRING_LENGTH, illegalArgumentException1.getMessage());

        IllegalArgumentException illegalArgumentException2 = assertThrows(IllegalArgumentException.class, () -> {
            int arrayLength = 옹알이.MAX_ARRAY_LENGTH;
            String[] babbling = generateStringArray(arrayLength, 옹알이.MAX_STRING_LENGTH + 1);
            solution.solution(babbling);
        });
        assertEquals(옹알이.ERROR_MESSAGE_STRING_LENGTH, illegalArgumentException2.getMessage());
    }

    private String[] generateStringArray(int arrayLength, int stringMaxLength) {
        String[] babbling = new String[arrayLength];
        for (int index=0; index < arrayLength; index++) {
            babbling[index] = generateString(stringMaxLength);
        }
        return babbling;
    }

    private String generateString(int stringLength) {
        SecureRandom secureRandom = new SecureRandom();
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        return IntStream.range(0, stringLength)
            .map(index -> secureRandom.nextInt(characters.length()))
            .mapToObj(characters::charAt)
            .map(String::valueOf)
            .collect(Collectors.joining(""));
    }

    @Test
    void solution_test() {
        옹알이 solution = new 옹알이();
        assertEquals(1, solution.solution(new String[]{"aya", "yee", "u", "maa", "wyeoo"}));
        assertEquals(3, solution.solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}));
    }
}