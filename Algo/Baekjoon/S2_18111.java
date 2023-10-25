import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class S2_18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] nmb = bf.readLine().split(" ");
        int n = Integer.parseInt(nmb[0]);
        int m = Integer.parseInt(nmb[1]);
        long b = Integer.parseInt(nmb[2]);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] line = bf.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                int target = Integer.parseInt(line[j]);
                if (map.containsKey(target)) {
                    map.put(target, map.get(target)+1);
                } else {
                    map.put(target, 1);
                }
            }
        }
        bf.close();
        Integer[] heights = map.keySet().toArray(new Integer[0]);
        int len = heights.length;
        Arrays.sort(heights);
        int[] result = new int[2];
        result[0] = Integer.MAX_VALUE;
        result[1] = 0;
        for (int i = heights[0]; i < heights[len-1]+1; i++) {
            long block = b;
            int time = 0;
            boolean flag = true;
            for (int j = 0; j < len; j++) {
                if (i <= heights[j]) {
                    int count = (heights[j] - i) * map.get(heights[j]);
                    time += count * 2;
                    block += count;
                } else {
                    int count = (i-heights[j]) * map.get(heights[j]);
                    time += count;
                    block -= count;
                }
            }
            if (block >= 0 && time <= result[0]) {
                result[0] = time;
                result[1] = i;
            }
        }
        System.out.println(result[0] + " " + result[1]);
    }
}
