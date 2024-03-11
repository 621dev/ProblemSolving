import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;    // 입력된 값을 임시 저장할 변수

        while(!(line=br.readLine()).equals("0")) {
            if(isPalindrome(line)) bw.write("yes\n");
            else bw.write("no\n");
        }

        bw.flush();
        bw.close();
    }

    public static Boolean isPalindrome(String number){  // 입력된 값이 팰린드롬 수인지 확인하는 메소드
        int numberLen = number.length();
        int len = numberLen/2; // 각 자리의 수는 대치된 자릿수만 비교하면 되기 때문에 전체를 반복하지 않아도 됨
        for(int i=0;i<len;i++) {
            if(number.charAt(i)!=number.charAt(numberLen-i-1)){
                return false;
            }
        }
        return true;
    }
}