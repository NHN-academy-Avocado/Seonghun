package Silver;
import java.io.*;

public class S1_1991 {
    private static char[][] arr;
    private static int n;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bf.readLine());
        arr = new char[n][5];
        for (int i = 0; i < n; i++) {
            arr[i] = bf.readLine().toCharArray();
        }
        pretraversal(0);
        System.out.println();
        intraversal(0);
        System.out.println();
        potraversal(0);
        System.out.println();
    }

    private static void pretraversal(int y) {
        System.out.print(arr[y][0]);
        for (int i = 0; i < n; i++) {
            if (arr[i][0] == arr[y][2]) {
                pretraversal(i);
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i][0] == arr[y][4]) {
                pretraversal(i);
                break;
            }
        }
    }

    private static void intraversal(int y) {
        for (int i = 0; i < n; i++) {
            if (arr[i][0] == arr[y][2]) {
                intraversal(i);
                break;
            }
        }
        System.out.print(arr[y][0]);
        for (int i = 0; i < n; i++) {
            if (arr[i][0] == arr[y][4]) {
                intraversal(i);
                break;
            }
        }
    }

    private static void potraversal(int y) {
        for (int i = 0; i < n; i++) {
            if (arr[i][0] == arr[y][2]) {
                potraversal(i);
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i][0] == arr[y][4]) {
                potraversal(i);
                break;
            }
        }
        System.out.print(arr[y][0]);
    }
}
