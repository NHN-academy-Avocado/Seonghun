import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3_11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = bf.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[] arr = new int[n+1];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder answer = new StringBuilder("");
        for (int i = 1; i < n+1; i++) {
            arr[i] = Integer.parseInt(st.nextToken())+arr[i-1];
        }
        for (int i = 0; i < m; i++) {
            String[] temp = bf.readLine().split(" ");
            answer.append(arr[Integer.parseInt(temp[1])] - arr[Integer.parseInt(temp[0])-1]).append("\n");
        }
        bf.close();
        System.out.print(answer);
    }
}