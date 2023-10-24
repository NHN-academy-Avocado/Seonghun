package Silver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class S5_1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        bf.close();
        BigInteger nf = new BigInteger("1");
        // n!
        for (int i = 1; i <= n; i++) {
            nf = nf.multiply(new BigInteger(String.valueOf(i)));
        }
        // 숫자 하나씩 쪼개서 arr에 넣기
        char[] arr = String.valueOf(nf).toCharArray();
        
        int len = arr.length;
        int count = 0;

        // arr의 뒤부터 탐색하며 0일경우 count에 1 더해주고 아니면 멈춤
        for (int i = len-1; i > -1; i--) {
            if (arr[i] == '0') {
                count++;
            } else {
                break;
            }
        }
        
        System.out.println(count);
        
    }
}
