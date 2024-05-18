import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String[] inputs = br.readLine().split(" ");   // 테스트 케이스 수
        int N = Integer.parseInt(inputs[0]);    // 듣도 못한 사람의 수
        int M = Integer.parseInt(inputs[1]);    // 보도 못한 사람의 수

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        ArrayList<String> result = new ArrayList<>();
        for(int i=0; i < M; i++) {
            String temp = br.readLine();
            if(set.contains(temp)){
                result.add(temp);
            }
        }

        Collections.sort(result);

        bw.write(String.valueOf(result.size()));
        bw.newLine();
        for(String str : result) {
            bw.write(str);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}