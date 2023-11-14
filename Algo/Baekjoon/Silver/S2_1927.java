import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class S2_1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        PriorityQueue<Integer> que = new PriorityQueue<>();
        StringBuilder answer = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(bf.readLine());
            if (x == 0) {
                if (que.size() == 0) {
                    answer.append(0);
                } else {
                    answer.append(que.poll());
                }
                answer.append("\n");
            } else {
                que.add(x);
            }
        }
        bf.close();
        System.out.print(answer);
    }
}
