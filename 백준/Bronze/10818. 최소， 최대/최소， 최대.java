import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        br.readLine();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        while(st.hasMoreTokens()){
            long num = Integer.parseInt(st.nextToken());
            if(max<num) max=num;
            if(min>num) min=num;
        }
        bw.write(min + " " + max);
        bw.flush();
        bw.close();
    }
}