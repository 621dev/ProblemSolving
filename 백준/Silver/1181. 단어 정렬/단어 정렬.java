import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Set<String> wordSet = new LinkedHashSet<>();

        for(int i=0; i<N; i++){
            wordSet.add(br.readLine());
        }

        List<String> wordList = new ArrayList<>(wordSet);

        Collections.sort(wordList, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(s1.length() != s2.length()) {
                    return s1.length() - s2.length();
                } else {
                    return s1.compareTo(s2);
                }
            }
        });

        for(String str : wordList) {
            bw.write(str);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}