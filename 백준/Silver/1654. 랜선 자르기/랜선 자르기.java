import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int lenCount = Integer.parseInt(st.nextToken());
        long requiredCount = Integer.parseInt(st.nextToken());

        long[] ownLine = new long[lenCount];
        for(int i=0;i<lenCount;i++){
            ownLine[i] = Integer.parseInt(br.readLine());
        }

        long start = 1; // 끈의 가장 작은 값
        long end = Arrays.stream(ownLine).max().getAsLong();    // 끈이 가장 긴 값
        while(start <= end){
            long mid = (start + end) / 2;   // 최소값과 최고값의 탐색할 길이로 가정한다.
            long count = 0;

            /**
             * 가정한 길이로 잘랐을 때 랜서의 개수가 필요한 개수인지 확인해보자
             */
            for(int i=0;i<lenCount;i++){
                count += ownLine[i]/mid;
            }

            // count가 requiredCount보다 작다면 랜선의 최대 길이를 줄여 중간값을 낮춰야 한다.
            // count가 requiredCount보다 같거나 크다면 최소 길이를 늘려 중간값을 높여준다.
            if(count<requiredCount){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            // 최저값이 최대값보다 크거나 같아진다면 해당 값이 문제에서 찾는 길이이다.
        }
        bw.write(Long.toString(end));
        bw.flush();
        bw.close();
    }
}