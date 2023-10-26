import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S3_1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine())+1;
        bf.close();
        int[] arr = new int[n];
        if (n == 3 || n == 4) {
            System.out.println(1);
        } else if (n == 2) {
            System.out.println(0);
        } else {
            arr[2] = 1;
            arr[3] = 1;
            for (int i = 4; i < n; i++) {
                arr[i] = arr[i-1]+1;
                if (i % 3 == 0) {
                    arr[i] = Math.min(arr[i], arr[i/3]+1);
                }
                if (i % 2 == 0) {
                    arr[i] = Math.min(arr[i], arr[i/2]+1);
                }
            }
            System.out.println(arr[n-1]);
        }
    }
}
