import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class S5_11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(bf.readLine());
        HashMap<String, Boolean> map = new HashMap<>();
        StringBuilder answer = new StringBuilder("");
        for (int i = 0; i < m; i++) {
            String[] line = bf.readLine().split(" ");
            if (line[0].equals("add")) {
                map.put(line[1], true);
            } else if (line[0].equals("remove")) {
                map.remove(line[1]);
            } else if (line[0].equals("check")) {
                if (map.containsKey(line[1])) {
                    answer.append(1).append("\n");
                } else {
                    answer.append(0).append("\n");
                }
            } else if (line[0].equals("toggle")) {
                if (map.containsKey(line[1])) {
                    map.remove(line[1]);
                } else {
                    map.put(line[1], true);
                }
            } else if (line[0].equals("all")) {
                map.clear();
                for (int j = 1; j < 21; j++) {
                    map.put(String.valueOf(j), true);
                }
            } else {
                map.clear();
            }
        }
        bf.close();
        System.out.println(answer);
    }
}
