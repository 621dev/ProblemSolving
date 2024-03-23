import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numCount = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int primeCount = 0;
        for(int i=0; i<numCount; i++){
            int num = Integer.parseInt(st.nextToken());
            if(isPrime(num)) primeCount++;
        }
        bw.write(String.valueOf(primeCount));
        bw.flush();
        bw.close();
    }

    public static boolean isPrime(int num) {
        if(num<=1) return false;    // 0과 1은 소수가 아니다.
        if(num==2) return true;     // 2는 소수이다.
        if(num%2==0) return false;  // 2를 제외한 짝수는 소수가 아니다.
        for(int i=3;i*i<=num;i=i+2){    
            if(num%i==0){   // i로 나누어 나누어 떨어지면 소수가 아니다.
                return false;
            }
        }
        return true;
    }
}