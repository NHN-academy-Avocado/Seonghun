import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S4_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        bf.close();
        int count = n/5;
        int temp = n%5;
        if (temp == 0) {
            System.out.println(count);
        } else if (temp == 1 && count > 0) {
            System.out.println(count+1);
        } else if (temp == 2 && count > 1) {
            System.out.println(count+2);
        } else if (temp == 3) {
            System.out.println(count+1);
        } else if (temp == 4 && count > 0) {
            System.out.println(count+2);
        } else {
            System.out.println(-1);
        }
    }
}
