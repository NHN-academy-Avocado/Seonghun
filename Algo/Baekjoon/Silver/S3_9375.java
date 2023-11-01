import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class S3_9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        StringBuilder answer = new StringBuilder("");
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(bf.readLine());
            HashMap<String, Integer> map = new HashMap<>();
            for (int j = 0; j < n; j++) {
                String[] line = bf.readLine().split(" ");
                if (map.containsKey(line[1])) {
                    map.put(line[1], map.get(line[1])+1);
                } else {
                    map.put(line[1], 1);
                }
            }
            int temp = 1;
            for (int a: map.values()) {
                temp *= (a+1);
            }
            if (map.values().size() == 0) {
                answer.append(0).append("\n");
            } else {
                answer.append(temp-1).append("\n");
            }
        }
        bf.close();
        System.out.print(answer);
    }
}
