import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class S4_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bf.readLine().split(" ");
        String[] temp = bf.readLine().split(" ");
        bf.close();

        HashMap<String, Integer> hash = new HashMap<>(); 
        for (String x: input) {
            if (hash.containsKey(x)) {
                hash.put(x, hash.get(x)+1);
            } else {
                hash.put(x, 1);
            }
        }
        StringBuilder answer = new StringBuilder("");
        for (String x: temp) {
            if (hash.containsKey(x)) {
                answer.append(hash.get(x) + " ");
            } else {
                answer.append(0 + " ");
            }
        }
        System.out.println(answer);
    }
}
