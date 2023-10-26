import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S4_11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String line = bf.readLine();
        bf.close();
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(line);
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int time = 0;
        for (int i = 0; i < n; i++) {
            time += arr[i]*(n-i);
        }
        System.out.println(time);
    }
}
