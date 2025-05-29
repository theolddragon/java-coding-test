import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class 문자열_내림차순으로_배치하기 {
    public String solution(String s) {
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("문자의 길이는 1보다 크거나 같은 값이어야 합니다.");
        }

        Character[] characters = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            characters[i] = s.charAt(i);
        }
        Arrays.sort(characters, Collections.reverseOrder());
        return Arrays.stream(characters)
            .map(String::valueOf)
            .collect(Collectors.joining(""));
    }
}
