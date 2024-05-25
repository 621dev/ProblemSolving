import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i=0; i<N ;i++){
            numbers.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(numbers);

        for(int number : numbers){
            bw.write(String.valueOf(number));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}