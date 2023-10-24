package Silver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class S4_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        Stack<Boolean> stack = new Stack<>();
        StringBuilder answer = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            char[] line = bf.readLine().toCharArray();
            stack.clear();
            for (char x: line) {
                if (x == '(') {
                    stack.add(true);
                } else {
                    if (stack.empty()) {
                        stack.add(false);
                        break;
                    }
                    if (stack.peek()) {
                        stack.pop();
                    } else {
                        break;
                    }
                }
            }
            if (stack.empty()) {
                answer.append("YES\n");
            } else {
                answer.append("NO\n");
            }
        }
        bf.close();
        System.out.println(answer);
    }
}
