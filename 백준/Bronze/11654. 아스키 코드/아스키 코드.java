import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        char ch = br.readLine().toCharArray()[0];
        int sum = ch;
        bw.write(Integer.toString(sum));
        bw.flush();
        bw.close();
    }
}
