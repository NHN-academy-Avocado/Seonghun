import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class S2_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
        }
        bf.close();
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        int now = 2;
        int target = 0;
        StringBuilder answer = new StringBuilder("");
        answer.append("+").append("\n");
        while (target < n) {
            if (now <= n) {
                if (!stack.isEmpty() && stack.lastElement() == arr[target]) {
                    stack.pop();
                    answer.append("-").append("\n");
                    target++;
                } else {
                    answer.append("+").append("\n");
                    stack.add(now);
                    now++;
                }
            } else {
                if (stack.lastElement() == arr[target]) {
                    stack.pop();
                    answer.append("-").append("\n");
                    target++;
                } else {
                    answer.delete(0, answer.length());
                    answer.append("NO").append("\n");
                    break;
                }
            }
        }
        System.out.print(answer);
    }
}
