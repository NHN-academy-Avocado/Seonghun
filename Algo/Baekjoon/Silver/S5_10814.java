package Silver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class S5_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String[][] arr = new String[n][3];
        for (int i = 0; i < n; i++) {
            String[] temp = bf.readLine().split(" ");
            arr[i] = new String[]{temp[0], temp[1], String.valueOf(i)};
        }
        bf.close();
        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] x, String[] y) {
                if (x[0].equals(y[0])) {
                    return Integer.parseInt(x[2]) - Integer.parseInt(y[2]);
                }
                return Integer.parseInt(x[0]) - Integer.parseInt(y[0]);
            }
        });
        StringBuilder answer = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            answer.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }
        System.out.println(answer);
    }
}
