class Solution {
    public int solution(String myString, String pat) {
        int idx = myString.indexOf(pat);
        int cnt = 0;
        while(idx != -1){
            cnt++;
            idx = myString.indexOf(pat,idx+1);
        }
        int answer = cnt;
        return answer;
    }
}