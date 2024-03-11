import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // INPUT
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int maxNum = 0;
        int index = 0;
        for(int i=0;i<9;i++){
            int num = Integer.parseInt(br.readLine());
            if(num>maxNum){
                maxNum=num;
                index=i+1;
            }
        }
        bw.write(String.valueOf(maxNum));
        bw.newLine();
        bw.write(String.valueOf(index));
        bw.close();
    }
}