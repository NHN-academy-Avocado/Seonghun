public class Exercise6_13 {
    public static void main(String[] args) {
        int k = 10000;
        int[] arr = new int[k+1];
        prime(arr);

        int n = 7;

        int i = 2;
        int count = 0;
        while (count < n) {
            if (arr[i] == 0) {
                System.out.print(i + " ");
                count++;
            }
            i++;
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
