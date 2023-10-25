import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class S4_10828 {
    public static void main(String[] args) throws IOException {
        Stack<String> stack = new Stack<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringBuilder answer = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            String[] str = bf.readLine().split(" ");
            if (str[0].equals("push")) {
                stack.push(str[1]);
            } else if (str[0].equals("pop")) {
                if (stack.empty()) {
                    answer.append(-1).append("\n");
                } else {
                    answer.append(stack.pop()).append("\n");
                }
            } else if (str[0].equals("size")) {
                answer.append(stack.size()).append("\n");
            } else if (str[0].equals("empty")) {
                if (stack.empty()) {
                    answer.append(1).append("\n");
                } else {
                    answer.append(0).append("\n");
                }
            } else {
                if (stack.empty()) {
                    answer.append(-1).append("\n");
                } else {
                    answer.append(stack.peek()).append("\n");
                }
            }
        }
        bf.close();
        System.out.println(answer);
        
    }
}
