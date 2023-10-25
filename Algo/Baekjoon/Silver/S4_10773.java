import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class S4_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(bf.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(Integer.parseInt(bf.readLine()));
            if (stack.peek() == 0) {
                stack.pop();
                stack.pop();
            }
        }
        bf.close();
        int answer = 0;
        for (int i: stack) {
            answer += i;
        }
        System.out.println(answer);
    }
}
