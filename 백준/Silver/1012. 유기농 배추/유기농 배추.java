import java.io.*;
import java.util.ArrayList;

public class Main {

    static int[][] lineIdx;
    static int N, M, K;
    static boolean[][] isCheck;
    static int count;

    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int T = Integer.parseInt(br.readLine());   // 테스트 케이스 수

        for(int i=0;i<T;i++){
            String[] lineSplit = br.readLine().split(" ");
            M = Integer.parseInt(lineSplit[0]); // 가로 길이
            N = Integer.parseInt(lineSplit[1]); // 세로 길이
            K = Integer.parseInt(lineSplit[2]); // 배추의 개수

            lineIdx = new int[M][N]; // lineIdx 초기화 추가
            isCheck = new boolean[M][N];


            for(int j=0;j<K;j++){
                String line = br.readLine();
                String[] split = line.split(" ");
                int fir = Integer.parseInt(split[0]);
                int sec = Integer.parseInt(split[1]);

                lineIdx[fir][sec] = 1;
            }

            int answer = 0;
            for(int j=0;j<M;j++){
                for(int k=0;k<N;k++){
                    if(!isCheck[j][k] && lineIdx[j][k] == 1){
                        dfs(j, k);
                        answer++;
                    }
                }

            }
            bw.write(String.valueOf(answer));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

    public static void dfs(int startX, int startY) throws IOException {
        isCheck[startX][startY] = true;
        for(int i=0; i<4; i++) {
            int next_x = startX + dx[i];
            int next_y = startY + dy[i];
            if (next_x >= 0 && next_y >= 0 && next_x < M && next_y < N) {
                if (lineIdx[next_x][next_y] == 1 && !isCheck[next_x][next_y]) {
                    dfs(next_x, next_y);
                }
            }
        }
    }
}