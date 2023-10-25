import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1_20529 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        int[] answer = new int[t];
        for (int x = 0; x < t; x++) {
            int n = Integer.parseInt(bf.readLine());
            char[] arr = bf.readLine().toCharArray();
            int len = arr.length;
            int min = 9;
            int result = 0;
            if (n > 32) {
                min = 0;
            } else {
                for (int i = 0; i < len; i+=5) {
                    for (int j = i+5; j < len; j+=5) {
                        for (int k = j+5; k < len; k+=5) {
                            for (int l = 0; l < 4; l++) {
                                if (arr[i+l] != arr[j+l]) {
                                    result += 2;
                                } else {
                                    if (arr[i+l] != arr[k+l]) {
                                        result += 2;
                                    }
                                }
                            }
                            if (result < min) {
                                min = result;
                            }
                            result = 0;
                        
                        }
                    
                    }
                }
                answer[x] = min;
            }
        }
        bf.close();
        for (int i = 0; i < t; i++) {
            System.out.println(answer[i]);
        }
    }
}
