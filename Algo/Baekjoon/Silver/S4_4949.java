package Silver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class S4_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        StringBuilder answer = new StringBuilder("");
        while (true) {
            char[] line = bf.readLine().toCharArray();
            if (line.length == 1 && line[0] == '.') {
                break;
            }
            stack.clear();
            for (char x: line) {
                if (x == '(' || x == '[') {
                    stack.add(x);
                } else if (x == ')') {
                    if (stack.empty()) {
                        stack.add('d');
                        break;
                    }
                    char temp = stack.peek();
                    if (temp != '(') {
                        break;
                    }
                    stack.pop();
                } else if (x == ']') {
                    if (stack.empty()) {
                        stack.add('d');
                        break;
                    }
                    char temp = stack.peek();
                    if (temp != '[') {
                        break;
                    }
                    stack.pop();
                }
            }
            if (stack.empty()) {
                answer.append("yes\n");
            } else {
                answer.append("no\n");
            }
        }
        bf.close();
        System.out.println(answer);
    }
}