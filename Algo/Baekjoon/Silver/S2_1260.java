import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class S2_1260 {
    private static LinkedList<LinkedList<Integer>> list;
    private static boolean[] visited;
    private static StringBuilder answer = new StringBuilder("");
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] nmv = bf.readLine().split(" ");
        int n = Integer.parseInt(nmv[0]);
        int m = Integer.parseInt(nmv[1]);
        int v = Integer.parseInt(nmv[2]);
        list = new LinkedList<>();
        for (int i = 0; i < n+1; i++) {
            list.add(new LinkedList<Integer>());
        }
        for (int i = 0; i < m; i++) {
            String[] temp = bf.readLine().split(" ");
            list.get(Integer.parseInt(temp[0])).add(Integer.parseInt(temp[1]));
            list.get(Integer.parseInt(temp[1])).add(Integer.parseInt(temp[0]));
        }
        for (int i = 1; i < n+1; i++) {
            Collections.sort(list.get(i));
        }
        bf.close();
        visited = new boolean[n+1];
        dfs(v);
        answer.append("\n");
        visited = new boolean[n+1];
        visited[v] = true;
        bfs(v);
        System.out.println(answer);
    }
    private static void bfs(int v) {
        Queue<Integer> que = new LinkedList<>();
        que.add(v);
        while (!que.isEmpty()) {
            int x = que.poll();
            answer.append(x).append(" ");
            for (int y: list.get(x)) {
                if (visited[y] == false) {
                    visited[y] = true;
                    que.add(y);
                }
            }
        }
    }
    private static void dfs(int v) {
        answer.append(v).append(" ");
        visited[v] = true;
        for (int x: list.get(v)) {
            if (visited[x] == false) {
                dfs(x);
            }
        }
    }
}
