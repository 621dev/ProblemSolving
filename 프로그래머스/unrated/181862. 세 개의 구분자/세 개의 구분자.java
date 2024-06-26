import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String[] solution(String myStr) {
        String[] arr = Arrays.stream(myStr.split("[abc]+")).filter(str -> !str.isEmpty()).toArray(String[]::new);
        return arr.length == 0 ? new String[] { "EMPTY" } : arr;
    }
}