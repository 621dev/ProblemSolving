class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        StringBuilder sbStr = new StringBuilder(myString);
        for(int i=0; i<myString.length(); i++){
            if(sbStr.charAt(i)=='A'){
                sbStr.setCharAt(i,'B');
            }
            else{
                sbStr.setCharAt(i,'A');
            }

        }
        if(sbStr.indexOf(pat)>=0){
            return 1;
        }
        return answer;
    }
}