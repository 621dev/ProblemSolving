import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // INPUT
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        // -INPUT
        for(int i=1; i<=9; i++){
            System.out.printf("%d * %d = %d\n",a,i,a*i);
        }
    }
}