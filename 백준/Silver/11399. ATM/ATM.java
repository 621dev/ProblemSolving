import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());    // 사람의 수

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");   // 돈을 인출하는 데에 걸리는 시간

        int[] arr = new int[1001];  // 각 대기시간 별 저장할 공간

        for(int i=N; i>0; i--){
            arr[Integer.parseInt(st.nextToken())]++;
        }

        int prev = 0;	// 이전까지의 대기시간 누적 합
        int sum = 0;	// 사람 별 대기시간 총 합

        for(int i=0; i<=1000; i++){
            // 각 index 별로 0이 될 때까지 반복
            while(arr[i]-- > 0){
                sum += (i+prev);
                prev += i;
            }
        }
        
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
