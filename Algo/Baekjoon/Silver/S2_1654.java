import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2_1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] kn = bf.readLine().split(" ");
        int k = Integer.parseInt(kn[0]);
        int n = Integer.parseInt(kn[1]);
        int[] arr = new int[k];
        long sum = 0;
        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
            sum += arr[i];
        }
        bf.close();
        long min = 1;
        long max = sum/n+1;
        long now = (min+max)/2;
        long answer = -1;
        while (min < max) {
            int temp = 0;
            for (int i = 0; i < k; i++) {
                temp += arr[i]/now;
            }
            if (temp >= n) {
                if (now == answer) {
                    break;
                }
                answer = now;
                min = now;
            } else {
                max = now;
            }
            now = (min+max)/2;
        }
        System.out.println(answer);
    }
}