import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[][] lineIdx;
    static boolean[] isCheck;
    static int nodeCnt, lineCnt, startNode;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static Queue<Integer> qForBfs = new LinkedList<>();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");  

        nodeCnt = Integer.parseInt(st.nextToken()); // 정점의 개수
        lineCnt = Integer.parseInt(st.nextToken());   // 간선의 개수
        startNode = Integer.parseInt(st.nextToken());      // 탐색을 시작할 정점의 번호

        lineIdx = new int[nodeCnt + 1][nodeCnt + 1];  // 연결 된 네트워크의 idx
        isCheck = new boolean[nodeCnt+1];  // 해당 네트워크를 체크했는지 여부

        for(int i=0;i<lineCnt;i++){
            st = new StringTokenizer(br.readLine(), " ");
            int fir = Integer.parseInt(st.nextToken());
            int sec = Integer.parseInt(st.nextToken());

            lineIdx[fir][sec] = lineIdx[sec][fir] = 1;
        }

        dfs(startNode);
        bw.newLine();
        isCheck = new boolean[nodeCnt+1];
        bfs(startNode);
        bw.flush();
        bw.close();
    }

    public static void dfs(int start) throws IOException {
        isCheck[start] = true;
        bw.write(String.valueOf(start)+" ");
        for(int i=0; i<=nodeCnt; i++) {
            if(lineIdx[start][i] == 1 && !isCheck[i]){    // 해당 네트워크가 연결되어 있고, 해당 선을 이전에 체크했는지 여부 확인
                dfs(i); // 해당 컴퓨터를 감염시키고 네트워크 연결을 확인한다.
            }
        }
    }

    public static void bfs(int start) throws IOException {
        qForBfs.add(start);
        isCheck[start] = true;

        while(!qForBfs.isEmpty()) {

            start = qForBfs.poll();
            bw.write(String.valueOf(start)+" ");

            for(int i = 1 ; i <= nodeCnt ; i++) {
                if(lineIdx[start][i] == 1 && !isCheck[i]) {
                    qForBfs.add(i);
                    isCheck[i] = true;
                }
            }
        }
    }
}

