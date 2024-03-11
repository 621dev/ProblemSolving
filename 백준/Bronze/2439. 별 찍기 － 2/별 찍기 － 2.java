import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputLine = Integer.parseInt(br.readLine());
        for(int i=0;i<inputLine;i++){
            StringBuilder sb = new StringBuilder();
            sb.append(" ".repeat(inputLine - (i+1)));
            sb.append("*".repeat((i+1)));
            bw.write(sb.toString());
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}