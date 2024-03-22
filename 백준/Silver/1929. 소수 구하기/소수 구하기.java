import java.io.*;
import java.util.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int min = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());

        boolean[] isPrimeArray = new boolean[max+1];
        Arrays.fill(isPrimeArray, true);    // 소수라면 true로 나타내는 배열을 만든다.
        isPrimeArray[0] = false;    // 0은 소수가 아니다.
        isPrimeArray[1] = false;    // 1도 소수도 합성 수도 아니다.

        // 소수인 수의 배수는 소수가 아니다.
        for(int i = 2; i*i<=max;i++){
            if(isPrimeArray[i]){    // 소수 이면 해당 수의 배수는 소수가 아니게 된다.
                for(int j=i*i;j<=max;j+=i){
                    isPrimeArray[j]=false;
                }
            }
        }

        min = (min==1)?2:min;   // min이 1인 경우를 고려해야 한다.
        //  배열에서 true인 인덱스만 출력을 진행
        for(int i=min;i<=max;i++){
            if(isPrimeArray[i]){
                bw.write(String.valueOf(i));
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }
}