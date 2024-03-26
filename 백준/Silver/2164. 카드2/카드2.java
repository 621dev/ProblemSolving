import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> numQueue = new LinkedList<>();

        for(int i=1; i<=N; i++) numQueue.offer(i);  // 일단 1부터 N까지 큐를 완성해줍니다.

        while(numQueue.size() > 1){
            numQueue.poll();    // 맨 앞의 원소를 뽑습니다.
            numQueue.offer(numQueue.poll());    // 이후 다음 맨 앞의 원소를 뽑고 그 원소를 뒤에 삽입합니다.
        }


        bw.write(String.valueOf(numQueue.poll()));  // 하나 남은 원소를 출력합니다.
        bw.flush();
        bw.close();
    }
}