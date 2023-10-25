import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S3_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] mn = bf.readLine().split(" ");
        bf.close();
        int n = Integer.parseInt(mn[1]);
        int m = Integer.parseInt(mn[0]);
        System.out.println(primeArr(m, n));
    }

    public static StringBuilder primeArr(int m, int n) {
        StringBuilder answer = new StringBuilder("");
        int[] arr = new int[n+1];
        for (int i = 2; i < n+1; i++) {
            if (arr[i] == 0) {
                if (i >= m) {
                    answer.append(i).append("\n");
                }
                for (int j = i*2; j < n+1; j+=i) {
                    arr[j] = -1;
                }
            }
        }
        return answer;
    }
}
