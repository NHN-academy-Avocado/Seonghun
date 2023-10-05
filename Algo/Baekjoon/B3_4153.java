import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3_4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = bf.readLine().split(" ");
        while (!temp[0].equals("0")) {
            int x = (int) Math.pow(Integer.parseInt(temp[0]), 2), y = (int) Math.pow(Integer.parseInt(temp[1]), 2), z = (int) Math.pow(Integer.parseInt(temp[2]), 2);
            if (x == y + z || y == x + z || z == x + y) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
            temp = bf.readLine().split(" ");
        }
        bf.close();
    }
}