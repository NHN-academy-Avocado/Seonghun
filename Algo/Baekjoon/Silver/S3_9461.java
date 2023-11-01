import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S3_9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        StringBuilder answer = new StringBuilder("");
        long[] arr = new long[101];
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;
        arr[4] = 2;
        arr[5] = 2;
        for (int i = 6; i < 101; i++) {
            arr[i] = arr[i-1] + arr[i-5];
        }
        for (int i = 0; i < t; i++) {
            answer.append(arr[Integer.parseInt(bf.readLine())]).append("\n");
        }
        bf.close();
        System.out.print(answer);
    }
}
