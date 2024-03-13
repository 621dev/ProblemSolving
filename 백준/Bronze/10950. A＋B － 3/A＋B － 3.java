import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        for(int i=0;i<count;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            while(st.hasMoreTokens()){
                int sum = Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
                bw.write(Integer.toString(sum)+"\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
