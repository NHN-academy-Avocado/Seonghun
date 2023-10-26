import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S3_1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        StringBuilder answer = new StringBuilder("");
        int[][] fibo = new int[41][2];
        fibo[0] = new int[]{1, 0};
        fibo[1] = new int[]{0, 1};
        for (int i = 2; i < 41; i++) {
            fibo[i] = new int[]{fibo[i-1][0]+fibo[i-2][0], fibo[i-1][1]+fibo[i-2][1]};
        }
        for (int i = 0; i < t; i++) {
            int[] temp = fibo[Integer.parseInt(bf.readLine())];
            answer.append(temp[0]).append(" ").append(temp[1]).append("\n");
        }
        bf.close();
        System.out.print(answer);
    }
}
