import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input a
        int ax = sc.nextInt();
        int ay = sc.nextInt();
        int az = sc.nextInt();

        // input c
        int cx = sc.nextInt();
        int cy = sc.nextInt();
        int cz = sc.nextInt();

        /**
         * a ? b = a.z + b.x, a.y * b.y, a.x + b.z
         * a.z + b.x = c.x
         * a.y * b.y = c.y
         * a.x + b.z = c.z
         */

        System.out.printf("%d %d %d",cx-az,cy/ay,cz-ax);
    }
}