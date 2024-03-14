import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /**
         * 입력 받은 수를 N, N의 생성자를 M이라 한다. M의 최소값을 구해보자.
         * M이 가장 작은 수가 되는 경우의 수를 찾아보자. N = M + (9 * N의 자릿수)
         *
         *
         */
        String input = br.readLine();
        int inputNumber = Integer.parseInt(input);  // 입력된 수
        int numLen = input.length();
        for(int i=inputNumber-(9*numLen);i<inputNumber;i++){
            int compareNum = i + String.valueOf(i).chars().map(Character::getNumericValue).sum();
            if(inputNumber == compareNum){
                bw.write(String.valueOf(i));
                break;
            } else if (i == inputNumber - 1) {
                bw.write("0");
                break;
            }
        }

        bw.flush();
        bw.close();
    }
}
