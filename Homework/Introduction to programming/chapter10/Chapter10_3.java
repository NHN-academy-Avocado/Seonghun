import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter10_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bf.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        System.out.println(Ackermann(n, m));
    }

    private static int Ackermann(int n, int m) {
        if (m == 0) {
            return n+1;
        } else if(n == 0) {
            return Ackermann(m-1, 1);
        } else {
            return Ackermann(m-1, Ackermann(m, n-1));
        }
    }
}
