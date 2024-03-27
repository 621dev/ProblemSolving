import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());    // 테스트 케이스의 수

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int documentCount = Integer.parseInt(st.nextToken());   // 문서의 개수
            int documentNum = Integer.parseInt(st.nextToken());   //   몇 번째로 인쇄되었는지 궁금한 문서가 현재 몇번째에 놓여 있는지를 나타내는 정수

            st = new StringTokenizer(br.readLine(), " ");   // 중요도의 나열
            LinkedList<int[]> documentQueue = new LinkedList<>();   // queue로 활용할 리스트

            for(int j=0;j<documentCount;j++){
                documentQueue.offer(new int[]{j, Integer.parseInt(st.nextToken())});    // 초기 위치, 중요도
            }

            int count = 0; // 출력 될 횟수

            while(!documentQueue.isEmpty()) {
                int[] front = documentQueue.poll(); // 맨 앞의 원소를 추출한다.
                boolean isMax = true;

                for(int j=0;j<documentQueue.size();j++){

                    if(front[1] < documentQueue.get(j)[1]){ // 뽑아논 원소의 중요도가 현재 큐의 원소의 중요도보다 작을 경우

                        // 중요도 큰 원소의 앞 원소까지 큐의 뒤로 보낸다.
                        documentQueue.offer(front);
                        for(int k=0;k<j;k++){
                            documentQueue.offer(documentQueue.poll());
                        }

                        isMax = false;
                        break;
                    }
                }

                if(isMax==false){
                    continue;    // front 원소가 가장 큰 원소가 아니면 다음 반복문으로 건너 뛰어야 함
                }

                // front 원소가 가장 큰 원소이면 해당 원소를 출력
                count++;
                if(front[0]==documentNum){  // 가장 큰 원소가 찾는 문서라면 종료
                    break;
                }
            }

            bw.write(String.valueOf(count));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}

