package Gold;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class G4_7662 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        StringBuilder answer = new StringBuilder("");
        for (int t = 0; t < T; t++) {
            int K = Integer.parseInt(bf.readLine());
            PriorityQueue<Integer> pQue = new PriorityQueue<>();
            PriorityQueue<Integer> mQue = new PriorityQueue<>();
            int count = 0;
            int minus = 0;
            for (int k = 0; k < K; k++) {
                String[] temp = bf.readLine().split(" ");
                if (temp[0].equals("I")) {
                    pQue.add(Integer.parseInt(temp[1]));
                    mQue.add(-Integer.parseInt(temp[1]));
                    count++;
                } else {
                    if (!pQue.isEmpty()) {
                        count--;
                        if (temp[1].equals("1")) {
                            mQue.poll();
                            minus++;
                        } else {
                            pQue.poll();
                        }
                        if (count == 0) {
                            pQue.clear();
                            mQue.clear();
                            minus = 0;
                        }
                    }
                }
            }
            for (int i = 0; i < minus; i++) {
                pQue.poll();
            }
            if (pQue.isEmpty()) {
                answer.append("EMPTY\n");
            } else {
                answer.append(-mQue.peek()).append(" ").append(pQue.peek()).append("\n");
            }
        }
        System.out.print(answer);
        bf.close();
    }
}
