import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class S3_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        StringBuilder answer = new StringBuilder("");
        for (int i = 0; i < t; i++) {
            String[] nm = bf.readLine().split(" ");
            String[] arr = bf.readLine().split(" ");
            int n = Integer.parseInt(nm[0]);
            int m = Integer.parseInt(nm[1]);
            Queue<int[]> que = new LinkedList<>();
            PriorityQueue<Integer> prQue = new PriorityQueue<>(Collections.reverseOrder());
            for (int j = 0; j < n; j++) {
                if (j == m) {
                    que.add(new int[]{Integer.parseInt(arr[j]), 1});
                } else {
                    que.add(new int[]{Integer.parseInt(arr[j]), 0});
                }
                prQue.add(Integer.parseInt(arr[j]));
            }


            int count =1;
            Loop1:
            while (true) {
                int target = prQue.poll();
                int len = que.size();
                for (int k = 0; k < len; k++) {
                    int[] now = que.poll();
                    if (now[0] == target) {
                        if (now[1] == 1) {
                            answer.append(count).append("\n");
                            break Loop1;
                        }
                        break;
                    } else {
                        que.add(now);
                    }
                }
                count++;
            }
        }
        System.out.print(answer);
        bf.close();
    }
}