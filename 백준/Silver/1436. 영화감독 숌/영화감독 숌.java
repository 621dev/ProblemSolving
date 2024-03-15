import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int inputNumber = Integer.parseInt(input);  // 입력된 수
        int startNumber = 666;
        int count = 1;
        while(count<inputNumber) {
            startNumber++;          // 666부터 +1
            if(String.valueOf(startNumber).contains("666")) {   // +1 한 숫자에 666이 포함되어있는지 확인
                count++;
            }
    }
        bw.write(String.valueOf(startNumber));
        bw.flush();
        bw.close();
    }
}