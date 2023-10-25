import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class S4_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hash = new HashMap<>();
        int n = Integer.parseInt(bf.readLine());
        String[] arr1 = bf.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            hash.put(arr1[i], 1);
        }
        StringBuilder answer = new StringBuilder("");
        int m = Integer.parseInt(bf.readLine());
        String[] arr2 = bf.readLine().split(" ");
        bf.close();
        for (int i = 0; i < m; i++) {
            if (hash.get(arr2[i]) == null) {
                answer.append(0);
            } else {
                answer.append(1);
            }
            answer.append("\n");
        }
        System.out.print(answer);
    }
}
