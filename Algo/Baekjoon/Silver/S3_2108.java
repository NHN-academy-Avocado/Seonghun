import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class S3_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        HashMap<Integer, Integer> count = new HashMap<>();
        int[] arr = new int[n];
        int sum = 0;
        int maxCount = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
            sum += arr[i];
            if (count.containsKey(arr[i])) {
                count.put(arr[i], count.get(arr[i]) + 1);
            } else {
                count.put(arr[i], 1);
            }
            if (count.get(arr[i]) > maxCount) {
                maxCount = count.get(arr[i]);
                temp.clear();
                temp.add(arr[i]);
            } else if (count.get(arr[i]) == maxCount) {
                temp.add(arr[i]);
            }
        }
        bf.close();
        Collections.sort(temp);
        Arrays.sort(arr);
        StringBuilder answer = new StringBuilder("");
        answer.append(Math.round((double) sum / n)).append("\n").append(arr[n/2]).append("\n");
        if (temp.size() > 1) {
            answer.append(temp.get(1));
        } else {
            answer.append(temp.get(0));
        }
        answer.append("\n").append(arr[arr.length-1]-arr[0]);
        System.out.println(answer);
    }
}
