import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int coorCount = Integer.parseInt(br.readLine());   // 문제로 나온 좌표의 개수

        int[][] coordinate = new int[coorCount][2]; // 좌표를 저장할 변수

        for(int i=0; i<coorCount; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            coordinate[i][0] = Integer.parseInt(st.nextToken()); // x의 좌표
            coordinate[i][1] = Integer.parseInt(st.nextToken()); // y의 좌표
        }

        Arrays.sort(coordinate, (cur, next)-> {
            if(cur[0] == next[0]) {
                return cur[1] - next[1];    // x의 좌표가 같으면 y 좌표 비교
            }
            return cur[0] - next[0];    // x 좌표 비교
        });

        for(int i = 0; i < coorCount; i++) {
            bw.write(coordinate[i][0] + " " + coordinate[i][1]);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}

