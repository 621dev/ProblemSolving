import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[8];

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<8; i++){
            numbers[i] = sc.nextInt();
        }
        sc.close();

        String result = "mixed";
        if(isAscending(numbers)){
            result = "ascending";
        } else if(isDescending(numbers)){
            result = "descending";
        }

        System.out.println(result);
    }

    public static boolean isAscending(int[] numbers){
        for(int i=0; i<7; i++){
            if(numbers[i] > numbers[i+1]){
                return false;
            }
        }
        return true;
    }

    public static boolean isDescending(int[] numbers){
        for(int i=0; i<7; i++){
            if(numbers[i] < numbers[i+1]){
                return false;
            }
        }
        return true;
    }
}