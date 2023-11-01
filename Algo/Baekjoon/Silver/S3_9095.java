import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S3_9095 {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[12];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
        for (int i = 4; i < 11; i++) {
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
        }
        StringBuilder answer = new StringBuilder("");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++) {
            answer.append(arr[Integer.parseInt(bf.readLine())]).append("\n");
        }
        bf.close();
        System.out.print(answer);
    }
}
