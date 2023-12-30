import java.util.Arrays;
import java.util.stream.Collectors;
class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        Arrays.sort(answer);
        answer = Arrays.stream(answer)
            .filter(s->!s.isEmpty())
            .toArray(String[]::new);
        return answer;
    }
}