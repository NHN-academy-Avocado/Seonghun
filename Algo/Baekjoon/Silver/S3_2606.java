import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S3_2606 {
    private static int answer = 0;
    private static boolean[][] arr;
    private static boolean[] visited;
    private static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bf.readLine());
        int m = Integer.parseInt(bf.readLine());
        arr = new boolean[n+1][n+1];
        visited = new boolean[n+1];
        visited[1] = true;
        for (int i = 0; i < m; i++) {
            String[] inputNumbers = bf.readLine().split(" ");
            int a = Integer.parseInt(inputNumbers[0]), b = Integer.parseInt(inputNumbers[1]);
            arr[a][b] = true;
            arr[b][a] = true;
        }
        bf.close();
        search(1);
        System.out.println(answer);
    }

    public static void search(int now) {
        for (int i = 1; i < n+1; i++) {
            if (!visited[i] && arr[now][i]) {
                visited[i] = true;
                answer++;
                search(i);
            }
        }
    }
}
