package Silver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S5_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        bf.close();

        // 666부터 전부 탐색(비효율적)
        int count = 0;
        int answer = 0;
        for (int i = 666; i < 999999999; i++) {
            if (String.valueOf(i).contains("666")) {
                count += 1;
            }
            if (count == n) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);

    


        
        
    }
}