public class Exercise6_12 {
    public static void main(String[] args) {
        int n = 17;
        int[] arr = new int[n+1];
        prime(arr);
        for (int i = 2; i<n+1; i++) {
            if (arr[i] == 0) {
                System.out.print(i + " ");
            }
        }
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
