import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        int[] array = Arrays.stream(arr).distinct().toArray();
        int arrlength = array.length;
        for(int i=0; i<k; i++){
            if(i<arrlength){
                answer[i] = array[i];
            }
            else{
                answer[i] = -1;
            }
        }
        return answer;
    }
}