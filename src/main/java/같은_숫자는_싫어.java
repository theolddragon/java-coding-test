import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 같은_숫자는_싫어 {
    public static final int MAX_ARRAY_LENGTH = 1_000_000;
    public static final int MAX_ELEMENT_NUMBER = 9;
    public static final int MIN_ELEMENT_NUMBER = 0;

    public int[] solution(int []arr) {
        if (arr.length > MAX_ARRAY_LENGTH) {
            throw new IllegalArgumentException("배열의 크기는 1,000,000 이하입니다.");
        }

        List<Integer> arrayList = new ArrayList<>();
        for (int number : arr) {
            if (number > MAX_ELEMENT_NUMBER) {
                throw new IllegalArgumentException("배열의 원소의 크기는 9보다 작거나 작은 정수입니다.");
            }
            if (number < MIN_ELEMENT_NUMBER) {
                throw new IllegalArgumentException("배열의 원소의 크기는 0보다 크거나 같은 정수입니다.");
            }

            int currentLength = arrayList.size();
            if (currentLength == 0) {
                arrayList.add(number);
                continue;
            }

            int lastElement = arrayList.get(currentLength - 1);
            if (lastElement == number) {
                continue;
            }

            arrayList.add(number);
        }

        int[] answer = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }
        return answer;
    }
}
