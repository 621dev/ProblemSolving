import java.util.Arrays;

class Solution {
    public int solution(String[] strArr) {
        int[] arrLen = new int[30];
        
        for(String str : strArr){
            arrLen[str.length()-1] += 1; 
        }
        
        int answer = Arrays.stream(arrLen).max().orElseThrow();
        
        return answer;
    }
}