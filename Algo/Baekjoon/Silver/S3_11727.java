import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S3_11727 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        bf.close();
        if (n == 1) {
            System.out.println(1);
        } else if (n == 2) {
            System.out.println(3);
        } else {
            int[] arr = new int[n+1];
            arr[1] = 1;
            arr[2] = 3;
            for (int i = 3; i < n+1; i++) {
                arr[i] = (arr[i-1] + arr[i-2] * 2) % 10007;
            }
            System.out.println(arr[n]%10007);
        }
    }
}
