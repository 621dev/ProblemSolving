import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] numberArray = new int[10];
        int number = 1;

        for(int i=0;i<3;i++){
            number *= Integer.parseInt(br.readLine());
        }

        String numberStr = Integer.toString(number);
        for(char digit : numberStr.toCharArray()){
            numberArray[digit - '0']++;
        }
        
        for(int i : numberArray) {
            bw.write(Integer.toString(i));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}