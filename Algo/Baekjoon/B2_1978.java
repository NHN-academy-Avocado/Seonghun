import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String[] arr = bf.readLine().split(" ");
        bf.close();
        int[] primeArr = makePrimeArr();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (primeArr[Integer.parseInt(arr[i])] == 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    // 에라토스테네스의 채 만들기
    private static int[] makePrimeArr() {
        int[] arr = new int[1001];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < 1001; i++) {
            if (arr[i] == 0) {
                for (int j = i*2; j < 1001; j+=i) {
                    arr[j] = 1;
                }
            }
        }
        return arr;
    }
}