import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class S5_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            String[] line = bf.readLine().split(" ");
            arr[i] = new int[]{Integer.parseInt(line[0]), Integer.parseInt(line[1])};
        }
        bf.close();
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] x, int[] y) {
                if (x[0] == y[0]) {
                    return x[1] - y[1];
                }
                return x[0] - y[0];
            }
        });
        StringBuilder answer = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            answer.append(arr[i][0] + " " + arr[i][1]).append("\n");
        }
        System.out.print(answer);
        
    }
}