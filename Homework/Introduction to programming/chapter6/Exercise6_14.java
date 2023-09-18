public class Exercise6_14 {
    public static void main(String[] args) {
        int n = 220;
        int[] arr = new int[n+1];
        prime(arr);

        int i = 2;
        while (i < n+1) {
            if (arr[i] == 0 && n%i == 0) {
                System.out.print(i + " ");
                n /= i;
            } else {
                i++;
            }
        }
        System.out.println();
    }

    private static void prime(int[] arr) {
        int len = arr.length;
        for (int i = 2; i < len; i++) {
            if (arr[i] == 0) {
                for (int j = i*2; j < len; j += i) {
                    arr[j] = -1;
                }
            }
        }
    }
}
