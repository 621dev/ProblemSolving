class Solution {
    public int solution(String binomial) {
        int answer = 0;
        binomial = binomial.replaceAll("\\s","");
        if(binomial.indexOf("+")>=0){
            String[] temp = binomial.split("\\+");
            answer = Integer.parseInt(temp[0])+Integer.parseInt(temp[1]);
        }
        else if(binomial.indexOf("-")>=0){
            String[] temp = binomial.split("-");
            answer = Integer.parseInt(temp[0])-Integer.parseInt(temp[1]);
        }
        else if(binomial.indexOf("*")>=0){
            String[] temp = binomial.split("\\*");
            answer = Integer.parseInt(temp[0])*Integer.parseInt(temp[1]);
        }
        return answer;
    }
}