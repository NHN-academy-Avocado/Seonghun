package Silver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S4_18110 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int answer = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
        }
        int deleteCount = (int) Math.round(n*15/100d);

        Arrays.sort(arr);
        for (int i = deleteCount; i < n-deleteCount; i++) {
            answer += arr[i];
        }

        System.out.println(Math.round(1d*answer/(n-(2*deleteCount))));
    }
}
