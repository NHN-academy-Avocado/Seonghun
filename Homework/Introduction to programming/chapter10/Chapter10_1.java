import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter10_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String n = bf.readLine();
        System.out.println(fibonacci(Integer.parseInt(n)));
        bf.close();
    }

    private static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("0보다 작으면 안됨");
        }
        if (n < 2) {
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}