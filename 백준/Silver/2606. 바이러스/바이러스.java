import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int[][] lineIdx;
    static boolean[] isVirus;
    static int count, comCnt, lineCnt;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        comCnt = Integer.parseInt(br.readLine());   // 컴퓨터의 수
        lineCnt = Integer.parseInt(br.readLine());      // 네트워크 상에 직접 연결되어 있는 컴퓨터 쌍의 수

        lineIdx = new int[comCnt + 1][comCnt + 1];  // 연결 된 네트워크의 idx
        isVirus = new boolean[comCnt+1];  // 해당 네트워크가 감염되어있는지 여부

        for(int i=0;i<lineCnt;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int fir = Integer.parseInt(st.nextToken());
            int sec = Integer.parseInt(st.nextToken());

            lineIdx[fir][sec] = lineIdx[sec][fir] = 1;
        }

        dfs(1); // 1번 컴퓨터부터 감염을 시작한다.


        bw.write(String.valueOf(count-1));
        bw.flush();
        bw.close();
    }

    public static void dfs(int num) {
        isVirus[num] = true;
        count++;

        for(int i=0; i<=comCnt; i++) {
            if(lineIdx[num][i] == 1 && !isVirus[i]){    // 해당 네트워크가 연결되어 있고, 해당 컴퓨터가 감염되어있지 않다면
                dfs(i); // 해당 컴퓨터를 감염시키고 네트워크 연결을 확인한다.
            }
        }
    }
}
