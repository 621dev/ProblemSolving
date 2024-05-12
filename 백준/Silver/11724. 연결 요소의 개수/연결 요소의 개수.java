import java.io.*;
import java.util.ArrayList;

public class Main {

    static int[][] lineIdx;
    static int N, M;
    static ArrayList<Integer>[] arrayLists;
    static boolean[] isCheck;

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String firstLine = br.readLine();
        String[] lineSplit = firstLine.split(" ");
        N = Integer.parseInt(lineSplit[0]); // 정점의 개수
        M = Integer.parseInt(lineSplit[1]); // 간선의 개수
        lineIdx = new int[N+1][N+1]; // lineIdx 초기화 추가
        isCheck = new boolean[N+1];

        for(int i=0;i<M;i++){
            String line = br.readLine();
            String[] split = line.split(" ");
            int fir = Integer.parseInt(split[0]);
            int sec = Integer.parseInt(split[1]);

            lineIdx[fir][sec] = lineIdx[sec][fir] = 1;
        }

        int answer = 0;
        for(int i=1;i<N+1;i++){
            if(!isCheck[i]){
                dfs(i);
                answer++;
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }

    public static void dfs(int start) throws IOException {
        isCheck[start] = true;
        for(int i=0; i<=N; i++) {
            if(lineIdx[start][i] == 1 && !isCheck[i]){
                dfs(i);
            }
        }
    }
}