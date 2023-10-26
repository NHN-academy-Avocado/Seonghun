import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S4_11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] nk = bf.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
        }
        bf.close();
        int now = n-1;
        int count = 0;
        while (k != 0) {
            if (k >= arr[now]) {
                k -= arr[now];
                count++;
            } else {
                now--;
            }
        }
        System.out.println(count);
    }
}
