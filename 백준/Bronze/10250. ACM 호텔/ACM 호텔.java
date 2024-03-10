import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();   // 테스트 데이터의 수

        for(int i=0;i<T;i++){
            int H = sc.nextInt();   // 호텔의 층
            int W = sc.nextInt();   // 각 층의 방 수
            int N = sc.nextInt();   // 몇 번째 손님
            int roomNumber = assignRoomNumber(W,H,N);
            /**
             * 6층의 12호실의 10번째 손님 -> 12층의 6호실의 10번째 손님
             * 단 호실의 계산은 정상적으로 진행해야한다.
             */
            System.out.println(roomNumber);
        }
        sc.close();
    }

    public static int assignRoomNumber(int floor, int roomNum, int customerNum) {
        int cusFloor = ((customerNum-1) / roomNum) + 1;
        int cusRoomNum = customerNum - (roomNum*(cusFloor-1)); // 4
        return cusRoomNum*100 + cusFloor;   // 호실을 계산하는 식은 층과 호실을 뒤집어야 한다.
    }
}