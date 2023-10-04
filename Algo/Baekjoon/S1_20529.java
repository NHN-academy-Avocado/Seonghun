import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1_20529 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        for (int x = 0; x < t; x++) {
            int n = Integer.parseInt(bf.readLine());
            char[] arr = bf.readLine().toCharArray();
            int len = arr.length;
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < len; i+=5) {
                for (int j = i+5; j < len; j+=5) {
                    for (int k = j+5; k < len; k+=5) {

                    }
                }
            }

        }
    }
}
