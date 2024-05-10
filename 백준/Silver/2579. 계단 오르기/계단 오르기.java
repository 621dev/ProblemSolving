import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());    // 계단의 개수

        int[] stairs = new int[N]; // 계단 점수
        int[] scores = new int[N]; // 각 계단까지의 최고 점수

        for(int i=0;i<N;i++){
            stairs[i] = Integer.parseInt(br.readLine());
        }

        scores[0] = stairs[0];  // 첫 계단의 최고 점수는 첫번째 계단의 점수이다.
        if (N > 1) {
            scores[1] = stairs[0] + stairs[1];  // 2층의 최고 점수는 1층과 2층을 합한 점수이다.
        }
        if (N > 2) {
            scores[2] = Math.max(stairs[0], stairs[1]) + stairs[2]; // 3층의 최고 점수는 0층과 1층 중 높은 점수와 3층의 점수를 합한 점수이다.
        }

        for(int n = 3; n < N; n++) {
            scores[n] = Math.max(scores[n-3]+stairs[n-1],scores[n-2])+stairs[n];
        }

        bw.write(String.valueOf(scores[N-1]));
        bw.flush();
        bw.close();
    }
}