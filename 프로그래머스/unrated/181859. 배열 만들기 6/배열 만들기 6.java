import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            int endIdx = stk.size()-1;
            if(stk.isEmpty() || stk.get(endIdx)!=arr[i]){
                stk.add(arr[i]);
            }
            else{
                stk.remove(endIdx);
            }
        }
        if(stk.isEmpty()){
            return new int[]{-1};
        }
        int[] answer = stk.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}