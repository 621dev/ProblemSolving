import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int subjectCount = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        double[] scores = new double[subjectCount];
        for(int i=0; i<subjectCount; i++) scores[i] = Double.parseDouble(st.nextToken());
        
        double maxScore = Arrays.stream(scores).max().getAsDouble();
        for(int i=0; i<subjectCount; i++){
            scores[i] = scores[i]/maxScore*100;
        }
        double average = Arrays.stream(scores).average().getAsDouble();
        bw.write(String.valueOf(average));
        bw.flush();
        bw.close();
    }
}