import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class S2_1012 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        StringBuilder answer = new StringBuilder("");
        for (int i = 0; i < t; i++) {
            String[] mnk = bf.readLine().split(" ");
            int m = Integer.parseInt(mnk[0]);
            int n = Integer.parseInt(mnk[1]);
            int k = Integer.parseInt(mnk[2]);
            boolean[][] arr = new boolean[n][m];
            int count = 0;
            int[][] plant = new int[k][2];
            for (int j = 0; j < k; j++) {
                String[] tmp = bf.readLine().split(" ");
                plant[j] = new int[]{Integer.parseInt(tmp[1]), Integer.parseInt(tmp[0])};
                arr[plant[j][0]][plant[j][1]] = true;
            }
            int[] di = {1, -1, 0, 0};
            int[] dj = {0, 0, 1, -1};
            for (int j = 0; j < k; j++) {
                if (arr[plant[j][0]][plant[j][1]]) {
                    count++;
                    arr[plant[j][0]][plant[j][1]] = false;
                    Queue<int[]> que = new LinkedList<>();
                    que.add(plant[j]);
                    while (!que.isEmpty()) {
                        int[] temp = que.poll();
                        for (int r = 0; r < 4; r++) {
                            int dy = temp[0] + di[r];
                            int dx = temp[1] + dj[r];
                            if (dy >= 0 && dy < n && dx >= 0 && dx < m && arr[dy][dx]) {
                                que.add(new int[]{dy, dx});
                                arr[dy][dx] = false;
                            }
                        }
                    }
                }
            }
            answer.append(count).append("\n");
        }
        bf.close();
        System.out.print(answer);
    }
}