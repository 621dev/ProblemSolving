class Solution {
    public String solution(String myString, String pat) {
        int index = myString.lastIndexOf(pat);
        String answer = myString.substring(0,index+pat.length());
        return answer;
    }
}