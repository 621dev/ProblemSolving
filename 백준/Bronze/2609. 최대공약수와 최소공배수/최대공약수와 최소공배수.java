import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());

        int x = first;
        int y = second;
        int z = x % y;  // 최대 공약수는 x에 y를 나누었을때 0으로 나누어 떨어지면 y가 x와 y의 최대공약수다.
        while(z!=0){    // 0으로 나누어 떨어지지 않으면 다시 나누어 나머지를 구한다.
            x = y;
            y = z;
            z = x % y;
        }
        int gcd = y;
        // 최소공배수는 a와 b의 곱을 a와 b의 최대공약수를 나눈 것과 같다.
        int lcm = (first*second)/gcd;

        bw.write(String.valueOf(gcd));
        bw.newLine();
        bw.write(String.valueOf(lcm));

        bw.flush();
        bw.close();
    }
}