import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class S4_17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = bf.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] line = bf.readLine().split(" ");
            map.put(line[0], line[1]);
        }

        StringBuilder answer = new StringBuilder("");
        for (int i = 0; i < m; i++) {
            answer.append(map.get(bf.readLine())).append("\n");
        }
        bf.close();
        System.out.println(answer);
    }
    
}
