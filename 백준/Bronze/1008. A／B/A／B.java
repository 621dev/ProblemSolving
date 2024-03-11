import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[8];

        Scanner sc = new Scanner(System.in);
        // INPUT
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        // -INPUT
        sc.close();

        System.out.println(a/b);
    }
}