package Silver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class S5_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        List<String> arr = new ArrayList<String>();
        PriorityQueue<String[]> list = new PriorityQueue<String[]>(new Comparator<String[]>() {
            @Override
            public int compare(String[] x, String[] y) {
                if (Integer.parseInt(x[1]) == Integer.parseInt(y[1])) {
                    char[] tempx = x[0].toCharArray();
                    char[] tempy = y[0].toCharArray();
                    int len = tempx.length;
                    for (int i = 0; i < len; i++) {
                        if (tempx[i] > tempy[i]) {
                            return 1;
                        } else if (tempx[i] < tempy[i]) {
                            return -1;
                        }
                    }
                    return 1;
                }
                return Integer.parseInt(x[1]) - Integer.parseInt(y[1]);
            }
        });
        for (int i = 0; i<n; i++) {
            String temp = bf.readLine();
            if (!arr.contains(temp)) {
                arr.add(temp);
                list.add(new String[]{temp, String.valueOf(temp.length())});
            }
        }

        while (!list.isEmpty()) {
            System.out.println(list.poll()[0]);
        }
        bf.close();
    }
}
