import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);     // 정수 N
        int K = Integer.parseInt(input[1]);     // 정수 K

        int answer = factorial(N)/(factorial(K)*factorial(N-K));
        bw.write(String.valueOf(answer));
        br.close();
        bw.flush();
        bw.close();
    }

    public static int factorial(int num) {
        int result = 1; // 0과 1은 1이다.

        for(int i=2; i<=num; i++){
            result = result * i;
        }
        return result;
    }
}