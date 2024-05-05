import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int[][] lineIdx;
    static boolean[] isCheck;
    static int nodeCnt, lineCnt, startNode;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int answerFir, answerSec;
    static int count = -1;   // 구하려는 촌 수
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        nodeCnt = Integer.parseInt(br.readLine()); // 정점의 개수 (전체 사람의 수)

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        answerFir = Integer.parseInt(st.nextToken());
        answerSec = Integer.parseInt(st.nextToken());

        lineCnt = Integer.parseInt(br.readLine());   // 간선의 개수 : 부모 자직들 간의 관계의 개수

        lineIdx = new int[nodeCnt + 1][nodeCnt + 1];  // 연결 된 네트워크의 idx
        isCheck = new boolean[nodeCnt+1];  // 해당 네트워크를 체크했는지 여부

        for(int i=0;i<lineCnt;i++){
            st = new StringTokenizer(br.readLine(), " ");
            int fir = Integer.parseInt(st.nextToken());
            int sec = Integer.parseInt(st.nextToken());

            lineIdx[fir][sec] = lineIdx[sec][fir] = 1;
        }

        dfs(answerFir, 0);
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }

    public static void dfs(int start, int depth) throws IOException {
        isCheck[start] = true;
        if(start == answerSec){
            count = depth;
            return;
        }
        for(int i=0; i<=nodeCnt; i++) {
            if(lineIdx[start][i] == 1 && !isCheck[i]){    // 해당 네트워크가 연결되어 있고, 해당 선을 이전에 체크했는지 여부 확인
                dfs(i, depth + 1);
            }
        }
    }

}