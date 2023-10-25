import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class S5_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder("");
        

        // Collections.sort
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i <n; i++) {
            arr.add(Integer.parseInt(bf.readLine()));
        }
        bf.close();
        
        Collections.sort(arr);

        for (int i = 0; i < n; i++) {
            sb.append("" + arr.get(i) + "\n");
        }
        System.out.println(sb);
    }
}