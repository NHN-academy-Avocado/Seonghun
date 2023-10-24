package Silver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class S4_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        bf.close();
        Queue<Integer> que = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            que.add(i);
        }
        while (!que.isEmpty()) {
            int temp = que.poll();
            if (que.isEmpty()) {
                System.out.println(temp);
                break;
            }
            que.add(que.poll());
        }
    }
}
