import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] strs = br.readLine().split(" ");
        int result=0;
        for(int i=0;i<5;i++){
            int number = Integer.parseInt(strs[i]);
            result += (number*number);
        }
        bw.write(Integer.toString(result%10));
        bw.flush();
        bw.close();
    }
}