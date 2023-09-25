import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chapter10_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] n = bf.readLine().split(" ");
        int x = Integer.parseInt(n[0]);
        int y = Integer.parseInt(n[1]);
        System.out.println(gcd(x, y));
        System.out.println(prime(x, y));
        System.out.println(rest(x, y));
        bf.close();
    }
    

    private static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x%y);
    }


    private static int rest(int x, int y) {
        if (x < 0) {
            return rest(x+y, y);
        } else if (x < y) {
            return x;
        }
        return rest(x-y, y);
    }

    private static boolean prime(int x, int y) {
        if (x == 1 || y == 1) {
            return true;
        } else if (x == y) {
            return false;
        } else if (x < y) {
            return prime(x, y-x);
        } else {
            return prime(x-y, y);
        }
    }
}
