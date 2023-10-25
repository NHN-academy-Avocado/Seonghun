import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class S2_21736 {
    private static int n;
    private static int m;
    private static char[][] arr;
    private static byte[][] visited;
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = bf.readLine().split(" ");
        n = Integer.parseInt(temp[0]);
        m = Integer.parseInt(temp[1]);
        arr = new char[n][m];
        int[] now = {0, 0};
        for (int i = 0; i < n; i++) {
            arr[i] = bf.readLine().toCharArray();
            for (int j = 0; j<m; j++) {
                if (arr[i][j] == 'I') {
                    now[0] = i;
                    now[1] = j;
                }
            }
        }
        visited = new byte[n][m];

        int answer = bfs(now);
        if (answer == 0) {
            System.out.println("TT");
        } else {
            System.out.println(answer);
        }
    }

    private static int bfs(int[] now) {
        int count = 0;
        Queue<Integer> que = new LinkedList<> ();
        int[] di = {1, -1, 0, 0};
        int[] dj = {0, 0, 1, -1};
        int nexti = 0;
        int nextj = 0;
        visited[now[0]][now[1]] = 1;
        que.offer(now[0]);
        que.offer(now[1]);
        while (!que.isEmpty()) {
            now[0] = que.poll();
            now[1] = que.poll();
            for (int i = 0; i<4; i++) {
                nexti = now[0]+di[i];
                nextj = now[1]+dj[i];
                if (nexti >= 0 && nexti < n && nextj >= 0 && nextj < m && visited[nexti][nextj] == 0 && arr[nexti][nextj] != 'X') {
                    visited[nexti][nextj] = 1;

                    if (arr[nexti][nextj] == 'P') {
                        count++;
                    }
                    que.add(nexti);
                    que.add(nextj);
                }
            }
        }
        return count;

    }
}