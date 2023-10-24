package Gold;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class G4_14500 {
    static int n;
    static int m;
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = bf.readLine().split(" ");
        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);
        arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            String[] line = bf.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(line[j]);
            }
        }
        bf.close();
        int answer = shape1();
        answer = Math.max(answer, shape2());
        answer = Math.max(answer, shape3());
        System.out.println(answer);
    }

    public static int shape1() {
        // 가로
        int max = 0;
        for (int i = 0; i < n; i++) {
            int result = 0;
            for (int j = 0; j < m-3; j++) {
                result = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i][j+3];
                if (result > max) {
                    max = result;
                }
            }
            
        }
        // 세로
        for (int i = 0; i < n-3; i++) {
            int result = 0;
            for (int j = 0; j < m; j++) {
                result = arr[i][j] + arr[i+1][j] + arr[i+2][j] + arr[i+3][j];
                if (result > max) {
                    max = result;
                }
            }
        }
        return max;
    }

    public static int shape2() {
        int max = 0;
        for (int i = 0; i < n-1; i++) {
            int result = 0;
            for (int j = 0; j < m-1; j++) {
                result = arr[i][j] + arr[i][j+1] + arr[i+1][j] + arr[i+1][j+1];
                if (result > max) {
                    max = result;
                }
            }
        }
        return max;
    }

    public static int shape3() {
        // 가로로 긴 직사각형
        int max = 0;
        for (int i = 0; i < n-1; i++) {
            int[] result = new int[8];
            for (int j = 0; j < m-2; j++) {
                result[0] = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+2];
                result[1] = arr[i+1][j] + arr[i+1][j+1] + arr[i+1][j+2] + arr[i][j+2];
                result[2] = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j];
                result[3] = arr[i+1][j] + arr[i+1][j+1] + arr[i+1][j+2] + arr[i][j];

                result[4] = arr[i][j] + arr[i][j+1] + arr[i+1][j+1] + arr[i+1][j+2];
                result[5] = arr[i+1][j] + arr[i+1][j+1] + arr[i][j+1] + arr[i][j+2];
                
                result[6] = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1];
                result[7] = arr[i+1][j] + arr[i+1][j+1] + arr[i+1][j+2] + arr[i][j+1];
                Arrays.sort(result);
                if (max < result[7]) {
                    max = result[7];
                }
            }
        }
        // 세로로 긴 직사각형
        for (int i = 0; i < n-2; i++) {
            int[] result = new int[8];
            for (int j = 0; j < m-1; j++) {
                result[0] = arr[i][j] + arr[i+1][j] + arr[i+2][j] + arr[i+2][j+1];
                result[1] = arr[i][j+1] + arr[i+1][j+1] + arr[i+2][j+1] + arr[i+2][j];
                result[2] = arr[i][j] + arr[i+1][j] + arr[i+2][j] + arr[i][j+1];
                result[3] = arr[i][j+1] + arr[i+1][j+1] + arr[i+2][j+1] + arr[i][j];

                result[4] = arr[i][j] + arr[i+1][j] + arr[i+1][j+1] + arr[i+2][j+1];
                result[5] = arr[i][j+1] + arr[i+1][j+1] + arr[i+1][j] + arr[i+2][j];
                
                result[6] = arr[i][j] + arr[i+1][j] + arr[i+2][j] + arr[i+1][j+1];
                result[7] = arr[i][j+1] + arr[i+1][j+1] + arr[i+2][j+1] + arr[i+1][j];
                Arrays.sort(result);
                if (max < result[7]) {
                    max = result[7];
                }
            }
        }
        return max;
    }
}
