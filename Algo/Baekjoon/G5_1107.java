import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class G5_1107 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        char[] nArr = String.valueOf(n).toCharArray();
        int m = Integer.parseInt(bf.readLine());
        // flase 가 정상, ture면 고장난거
        boolean[] button = new boolean[10];
        for (int i = 0; i < m*2-1; i++) {
            int temp = Character.getNumericValue(bf.read());
            if (temp != -1) {
                button[temp] = true;
            }
        }
        // 100부터 +, - 버튼만으로 이동
        int answer1 = Math.abs(100 - n);

        if (m == 10) {
            System.out.println(answer1);
        } else {
            // 고장나지 않은 버튼 중에서 가장 큰 수
            int min = 10;

            // 고장나지 않은 버튼 중에서 가장 작은 수
            int max = -1;

            for (int i = 0; i <10; i++) {
                if (!button[i]) {
                    if (i > max) {
                        max = i;
                    }
                    if (i < min) {
                        min = i;
                    }
                }
            }

            
        }
        
    }
}
