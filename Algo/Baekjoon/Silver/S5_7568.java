import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class S5_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[][] arr = new int[n][3];
        int[] result = new int[n];
        StringBuilder answer = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            String[] temp = bf.readLine().split(" ");
            arr[i] = new int[]{Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), i};
        }
        bf.close();
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] x, int[] y) {
                if (x[0] == y[0]) {
                    return y[1] - x[1];
                }
                return y[0] - x[0];
            }
        });
        result[arr[0][2]] = 1;
        for (int i = 1; i < n; i++) {
            int count = 0;
            for (int j = i-1; j > -1; j--) {
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    count++;
                }
            }
            result[arr[i][2]] = count+1;
        }
        for (int i = 0; i < n; i++) {
            answer.append(result[i] + " ");
        }
        answer.deleteCharAt(answer.length()-1);
        System.out.println(answer);
    }
}