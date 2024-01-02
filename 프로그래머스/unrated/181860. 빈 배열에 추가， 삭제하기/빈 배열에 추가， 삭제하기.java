import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> intList = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            if(flag[i]){                
                for(int j=0; j < num*2; j++){
                    intList.add(num);
                }
            }
            else{
                for(int j=0; j < num; j++){
                    intList.remove(intList.size()-1);
                }
            }
        }
        
        int[] answer = intList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}