import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // NO를 출력해야 할 경우 문자열을 초기화 하고 NO를 입력 해야 하기 때문에 버퍼에 바로 입력할 수 없다.
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());
        Stack<Integer> numStack = new Stack<>();
        int currentNumber = 0;  // 현재 숫자
        for(int i=0; i<num; i++){
            int inputNum = Integer.parseInt(br.readLine());

            // 입력된 수가 현재 수보다 크다면 입력된 수까지 push
            if(inputNum > currentNumber){
                for(int j=currentNumber+1;j<=inputNum; j++){
                    numStack.push(j);
                    sb.append("+\n");
                }
                currentNumber = inputNum;   // 다음에 입력된 수와 비교하기 위해   4
            } else if (numStack.peek() != inputNum) {
                // 입력된 수가 현재 수보다 크지 않은데 stack의 마지막 수가 같지 않다면 stack 연산을 더 이상 진행할 수 없다.
                sb.setLength(0);
                sb.append("NO");
                break;
            }

            numStack.pop();
            sb.append("-\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
