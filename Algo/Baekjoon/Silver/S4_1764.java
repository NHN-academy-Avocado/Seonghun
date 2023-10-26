import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class S4_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = bf.readLine().split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        ArrayList<String> list = new ArrayList<>(); 
        for (int i = 0; i < n+m; i++) {
            String temp = bf.readLine();
            if (map.containsKey(temp)) {
                list.add(temp);
            } else {
                map.put(temp, 1);
            }
        }
        bf.close();
        System.out.println(list.size());
        Collections.sort(list);
        StringBuilder answer = new StringBuilder("");
        for (String temp: list) {
            answer.append(temp).append("\n");
        }
        System.out.println(answer);
    }
}
