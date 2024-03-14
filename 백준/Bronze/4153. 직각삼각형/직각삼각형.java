import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = "start";

        while(true) {
            input = br.readLine();
            if(input.equals("0 0 0")) break;
            StringTokenizer st = new StringTokenizer(input, " ");
            int[] triLen = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
            Arrays.sort(triLen);
            String strRightTriangle = (Math.pow(triLen[0],2)+Math.pow(triLen[1],2)==Math.pow(triLen[2],2))?"right":"wrong";
            bw.write(strRightTriangle);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
