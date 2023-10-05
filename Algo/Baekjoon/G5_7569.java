import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class G5_7569 {
    static int n, m, h;
    static int[][][] arr;
    static int tomatoCount;
    static int count = 0;
    static Queue<int[]> que = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = bf.readLine().split(" ");
        m = Integer.parseInt(temp[0]);
        n = Integer.parseInt(temp[1]);
        h = Integer.parseInt(temp[2]);
        tomatoCount = m * n * h;
        arr = new int[h][n][m];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                String[] line = bf.readLine().split(" ");
                for (int k = 0; k < m; k++) {
                    arr[i][j][k] = Integer.parseInt(line[k]);
                    if (arr[i][j][k] == 1) {
                        count++;
                        que.add(new int[]{i, j, k, 0});
                        arr[i][j][k] = 2;
                    } else if (arr[i][j][k] == -1) {
                        tomatoCount--;
                    }
                }
            }
        }
        bf.close();
        System.out.println(bfs());
    }

    public static int bfs() {
        int[] di = {-1, 1, 0, 0, 0, 0};
        int[] dj = {0, 0, -1, 1, 0, 0};
        int[] dk = {0, 0, 0, 0, 1, -1};
        int[] temp = new int[4];
        while (!que.isEmpty()) {
            temp = que.poll();
            for (int i = 0; i < 6; i++) {
                int ni = di[i]+temp[0];
                int nj = dj[i]+temp[1];
                int nk = dk[i]+temp[2];
                if (ni > -1 && ni < h && nj > -1 && nj < n && nk > -1 && nk < m && arr[ni][nj][nk] == 0) {
                    arr[ni][nj][nk] = 2;
                    count++;
                    que.add(new int[]{ni, nj, nk, temp[3]+1});
                }
            }
        }
        if (count == tomatoCount) {
            return temp[3];
        }
        return -1;
    }
}