import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 옹알이 {
    public static final int MAX_ARRAY_LENGTH = 100;
    public static final int MIN_ARRAY_LENGTH = 1;
    public static final int MAX_STRING_LENGTH = 15;
    public static final int MIN_STRING_LENGTH = 1;

    public static final String ERROR_MESSAGE_ARRAY_LENGTH  = "babbling의 길이는 최소 1, 최대 100입니다.";
    public static final String ERROR_MESSAGE_STRING_LENGTH = "babbling[i]의 길이는 최소 1, 최대 15입니다.";

    public int solution(String[] babbling) {
        if (babbling.length < MIN_ARRAY_LENGTH || babbling.length > MAX_ARRAY_LENGTH) {
            throw new IllegalArgumentException(ERROR_MESSAGE_ARRAY_LENGTH);
        }

        return (int) Arrays.stream(babbling)
            .filter(this::isSpeakable)
            .count();
    }

    private boolean isSpeakable(String word) {
        if (word.isEmpty() || word.length() > MAX_STRING_LENGTH) {
            throw new IllegalArgumentException(ERROR_MESSAGE_STRING_LENGTH);
        }

        List<String> speakList = Arrays.asList("aya", "ye", "woo", "ma");
        while (!word.isEmpty()) {
            boolean isMatch = false;
            for (String speak : speakList) {
                if (word.startsWith(speak)) {
                    word = word.replace(speak, "");
                    speakList = speakList.stream().filter(s -> !speak.equals(s)).collect(Collectors.toList());
                    isMatch =  true;
                    break;
                }
            }

            if (!isMatch) {
                return false;
            }
        }

        return true;
    }
}
