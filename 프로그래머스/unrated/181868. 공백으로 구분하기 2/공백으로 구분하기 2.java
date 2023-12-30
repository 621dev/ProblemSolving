import java.util.Arrays;
class Solution {
    public String[] solution(String my_string) {
        String[] stringArray = my_string.split(" ");
        String[] answer = Arrays.stream(stringArray)
            .map(String::trim)
            .toArray(String[]::new);
        answer = Arrays.stream(answer)
            .filter(s->!s.isEmpty())
            .toArray(String[]::new);
        return answer;
    }
}