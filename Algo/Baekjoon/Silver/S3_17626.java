import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S3_17626 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        bf.close();
        int[] arr = new int[50001];
        for (int i = 1; i < 4; i++) {
            arr[i] = i;
        }
        for (int i = 2; i < 224;i++) {
            arr[i*i] = 1;
        }
        for (int i = 3; i < 50001; i++) {
            if (arr[i] == 0) {
                int temp = 6;
                for (int j = 1; j <= (int) Math.sqrt(i); j++) {
                    if (arr[i-(j*j)] + 1 < temp) {
                        temp = arr[i-(j*j)] + 1;
                    }
                }
                arr[i] = temp;
            }
        }
        if (arr[n] > 5) {
            System.out.println(4);
        } else {
            System.out.println(arr[n]);
        }
    }
}
