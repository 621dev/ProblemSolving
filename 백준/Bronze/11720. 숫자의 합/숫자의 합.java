import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        String num = br.readLine();
        int sum = 0;
        for(char ch : num.toCharArray()){
            sum += Character.getNumericValue(ch);
        }
        bw.write(Integer.toString(sum));
        bw.flush();
        bw.close();
    }
}
