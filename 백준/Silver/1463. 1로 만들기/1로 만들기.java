import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());       // 1로 만들 정수 N

        Integer[] numbers = new Integer[N+1];  // 모든 수를 고려하여 입력 된 수만큼 입력 공간을 만들어준다.
        numbers[0] = 0;
        numbers[1] = 0;

        int answer = resolve(N, numbers);
        
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }

    public static int resolve(int num, Integer[] numbers) {
        if(numbers[num] == null) {  // 현재 입력된 수가 구하지 않은 수일 경우
            if(num%6==0){
                numbers[num] = Math.min(resolve(num-1, numbers), Math.min(resolve(num/3, numbers), resolve(num/2,numbers))) + 1;
            } else if(num%3==0) {
                numbers[num] = Math.min(resolve(num/3, numbers), resolve(num-1, numbers)) + 1;
            } else if(num%2==0) {
                numbers[num] = Math.min(resolve(num/2, numbers), resolve(num-1, numbers)) + 1;
            } else {
                numbers[num] = resolve(num-1, numbers) + 1;
            }
        }
        return numbers[num];
    }
}