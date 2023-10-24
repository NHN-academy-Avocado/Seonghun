package Silver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class S4_10866 {
    public static void main(String[] args) throws IOException {
        Deque<String> deq = new ArrayDeque<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringBuilder answer = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            String[] str = bf.readLine().split(" ");
            if (str[0].equals("push_front")) {
                deq.addFirst(str[1]);
            } else if (str[0].equals("push_back")) {
                deq.add(str[1]);
            } else if (str[0].equals("pop_front")) {
                if (deq.isEmpty()) {
                    answer.append(-1).append("\n");
                } else {
                    answer.append(deq.poll()).append("\n");
                }
            } else if (str[0].equals("pop_back")) {
                if (deq.isEmpty()) {
                    answer.append(-1).append("\n");
                } else {
                    answer.append(deq.pollLast()).append("\n");
                }
            } else if (str[0].equals("size")) {
                answer.append(deq.size()).append("\n");
            } else if (str[0].equals("empty")) {
                if (deq.isEmpty()) {
                    answer.append(1).append("\n");
                } else {
                    answer.append(0).append("\n");
                }
            } else if (str[0].equals("front")) {
                if (deq.isEmpty()) {
                    answer.append(-1).append("\n");
                } else {
                    answer.append(deq.peek()).append("\n");
                }
            } else if (str[0].equals("back")) {
                if (deq.isEmpty()) {
                    answer.append(-1).append("\n");
                } else {
                    answer.append(deq.peekLast()).append("\n");
                }
            } else {
                if (deq.isEmpty()) {
                    answer.append(-1).append("\n");
                } else {
                    answer.append(deq.getLast()).append("\n");
                }
            }
        }
        bf.close();
        System.out.println(answer);
    }
}