package Silver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S4_1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = bf.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        char[][] arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            arr[i] = bf.readLine().toCharArray();
        }
        bf.close();

        int count = 0;

        boolean flag = true;
        int answer = 65;
        for (int i = 0; i < n-7; i++) {
            for (int j = 0; j < m-7; j++) {
                flag = true;
                count = 0;
                for (int y = 0; y < 8; y++) {
                    for (int x = 0; x < 8; x++) {
                        if (flag && arr[i+y][j+x] == 'W') {
                            count++;
                        } else if (!flag && arr[i+y][j+x] == 'B') {
                            count++;
                        }
                        flag = !flag;
                    }
                    if (y%2 == 0) {
                        flag = false;
                    } else {
                        flag = true;
                    }
                }
                answer = Math.min(answer, count);
                if (n*m - count >= 0) {
                    answer = Math.min(answer, 64-count);
                }
            }
        }
        System.out.println(answer);
    }
}
