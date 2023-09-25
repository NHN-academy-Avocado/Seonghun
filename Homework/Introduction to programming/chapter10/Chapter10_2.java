import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter10_2 {
    private static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String n = bf.readLine();
        System.out.println(fibonacci(Integer.parseInt(n)));
        System.out.println("fibonaccit 실행 횟수: " + count);
        bf.close();
    }

    private static int fibonacci(int n) {
        count++;
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