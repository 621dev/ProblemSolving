import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");   // 행과 열을 입력 받음
        int row = Integer.parseInt(st.nextToken());
        int column = Integer.parseInt(st.nextToken());

        int[][] boardWhite = new int[row][column];
        int[][] boardBlack = new int[row][column];

        // 보드와 열과 행의 상태를 입력 받아 W로 시작하는 경우와 B로 시작하는 경우로 나누어 다시 칠해야 하는 좌표에만 1을 넣은 2차원 배열로 처리해주는 메소드
        processBoard(br, boardWhite, boardBlack);

        int minWhitSum = findMinSum(boardWhite);
        int minBlackSum = findMinSum(boardBlack);
        int minSum = Math.min(minWhitSum, minBlackSum);
        bw.write(Integer.toString(minSum));
        bw.flush();
        bw.close();
    }

    // 보드와 열과 행의 상태를 입력 받아 W로 시작하는 경우와 B로 시작하는 경우로 나누어 다시 칠해야 하는 좌표에만 1을 넣은 2차원 배열로 처리해주는 메소드
    public static void processBoard(BufferedReader br, int[][] boardWhite, int[][] boardBlack) throws IOException {
        int row = boardWhite.length;
        int column = boardWhite[0].length;

        for(int i=0;i<row;i++){
            String rowBoard = br.readLine();
            int evenRow = i%2;
            for(int j=0;j<column;j++){
                char ch = rowBoard.charAt(j);
                int evenColumn = j%2;
                int state = (evenRow == evenColumn) ? 0 : 1;
                boardWhite[i][j] = (ch == 'W') ? state : 1 - state;
                boardBlack[i][j] = (ch == 'B') ? state : 1 - state;
            }
        }


    }

    // 0과 1로 이루어진 배열을 받아 8*8 크기의 서브 배열의 합 중 최소 값을 리턴
    public static int findMinSum(int[][] board) {
        int row = board.length;
        int column = board[0].length;

        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i <= row - 8; i++) {
            for (int j = 0; j <= column - 8; j++) {
                int sum = 0;
                for (int x = i; x < i + 8; x++) {
                    for (int y = j; y < j + 8; y++) {
                        sum += board[x][y];
                    }
                }
                minSum = Math.min(minSum, sum);
            }
        }
        return minSum;
    }
}
