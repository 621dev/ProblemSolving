class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int arrlen = 1;
        while(len > arrlen){
            arrlen = arrlen*2;
        }
        
        int[] answer = new int[arrlen];
        for(int i = 0; i < arrlen ; i++){
            if(len>i){
                answer[i] = arr[i]; 
            }
            else{
                answer[i] = 0;
            }
        }
        return answer;
    }
}