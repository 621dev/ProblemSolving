import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while((input = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(input, " ");
            int sum = Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
            if(sum==0){
                break;
            }
            bw.write(Integer.toString(sum)+"\n");

        }
        bw.flush();
        bw.close();
    }
}
