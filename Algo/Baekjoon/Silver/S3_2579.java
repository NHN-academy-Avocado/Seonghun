import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S3_2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n+1];
        for (int i = 1; i < n+1; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
        }
        bf.close();
        if (n == 1) {
            System.out.println(arr[1]);
        } else if (n == 2) {
            System.out.println(arr[1]+arr[2]);
        } else {
            int[] result = new int[n+1];
            result[1] = arr[1];
            result[2] = arr[2]+arr[1];
            for (int i = 3; i < n+1; i++) {
                result[i] = Math.max(result[i-3]+arr[i-1]+arr[i], result[i-2]+arr[i]);
            }
            System.out.println(result[n]);
        }
        
        
    }
}