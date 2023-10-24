package Bronze;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1_1546 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        double[] arr = new double[n];
        String[] temp = bf.readLine().split(" ");
        double max = 0;
        double answer = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(temp[i]);
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        bf.close();
        for (int i = 0; i < n; i++) {
            answer += arr[i]/max * 100;
        }
        System.out.println(answer/n);
    }
}