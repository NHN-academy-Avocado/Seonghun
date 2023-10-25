import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class S5_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] nk = bf.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        Queue<Integer> que = new LinkedList<>();
        StringBuilder answer = new StringBuilder("");
        answer.append("<");
        for (int i = 1; i <= n; i++) {
            que.add(i);
        }
        while (!que.isEmpty()) {
            for (int i = 0; i < k-1; i++) {
                que.add(que.poll());
            }
            answer.append(que.poll() + ", ");
        }
        answer.delete(answer.length()-2, answer.length());
        answer.append(">");
        System.out.println(answer);
    }
}
