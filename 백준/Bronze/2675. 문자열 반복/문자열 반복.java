import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCount = Integer.parseInt(br.readLine());

        for(int i=0;i<testCount;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            StringBuilder sb = new StringBuilder();
            int count = Integer.parseInt(st.nextToken());
            for(char ch : st.nextToken().toCharArray()){
                sb.append(String.valueOf(ch).repeat(count));
            }
            sb.append("\n");
            bw.write(sb.toString());
        }

        bw.flush();
        bw.close();
    }
}