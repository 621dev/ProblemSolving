import java.io.*;
import java.util.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long num = Long.parseLong(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Set<Long> numSet = new HashSet<>();
        while (st.hasMoreTokens()) {
            numSet.add(Long.parseLong(st.nextToken()));
        }
        num = Long.parseLong(br.readLine());
        StringTokenizer containSt = new StringTokenizer(br.readLine(), " ");
        List<Long> ContainNumList = new ArrayList<>();
        while (containSt.hasMoreTokens()) {
            ContainNumList.add(Long.parseLong(containSt.nextToken()));
        }

        for(Long number : ContainNumList){
            if(numSet.contains(number)) bw.write("1\n");
            else bw.write("0\n");
        }

        bw.flush();
        bw.close();
    }
}
