import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2_2630 {
    private static int blue = 0;
    private static int white = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        boolean[][] arr = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            char[] line = bf.readLine().toCharArray();
            for (int j = 0; j < n; j++) {
                arr[i][j] = line[2*j] == '1';
            }
        }
        bf.close();
        search(arr, 0, 0, n, n);
        System.out.println(white);
        System.out.println(blue);
    }

    private static void search(boolean[][] arr, int sy, int sx, int ey, int ex) {
        boolean temp = arr[sy][sx];
        int count = 0;
        for (int i = sy; i < ey; i++) {
            for (int j = sx; j < ex; j++) {
                if (arr[i][j] == temp) {
                    count++;
                } else {
                    break;
                }
            }
        }
        if (count == (ey-sy) * (ey-sy)) {
            if (temp) {
                blue++;
            } else {
                white++;
            }
        } else {
            search(arr, sy, sx, (ey+sy)/2, (ex+sx)/2);
            search(arr, sy, (ex+sx)/2, (ey+sy)/2, ex);
            search(arr, (ey+sy)/2, sx, ey, (ex+sx)/2);
            search(arr, (ey+sy)/2, (ex+sx)/2, ey, ex);
        }
    }
}