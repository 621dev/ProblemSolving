import java.io.*;
import java.math.BigInteger;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long factorialNum = Integer.parseInt(br.readLine());
        BigInteger factorialSum = BigInteger.ONE;

        factorialSum = LongStream.rangeClosed(1, factorialNum)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);

        String sumStr = factorialSum.toString();
        long zeroCount = 0;

        for(int i=sumStr.length()-1;i>=0;i--) {
            if (sumStr.charAt(i) == '0') {
                zeroCount++;
            } else break;
        }

        bw.write(Long.toString(zeroCount));
        bw.flush();
        bw.close();
    }
}