import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input string
        String str = sc.next().toUpperCase();
        sc.close();

        // 각 알파벳 별 개수
        int[] charCount = new int[26];

        int max = 0; // 현재 최대값
        int result = 0; // 결과가 될 index

        for(char x : str.toCharArray()){
            int index = x - 'A';
            int count = charCount[index] + 1;   // 현재 알파벳의 갯수
            charCount[index] = count;

            if(max < count) {   // 현재 최대값보다 count가 크다면 count가 현재 최대값
                max = count;
                result = index;
            } else if (max == count) {  // 현재 최대값과 같다면 최대값은 2 이상이므로 결과는 ? 되어야 함
                result = -1;
            }
        }

        if(result == -1){
            System.out.println('?');
        } else {
            char chResult = (char)(result + 65);
            System.out.println(chResult);
        }
        //int result = Arrays.stream(charCount).max().getAsInt();
    }
}