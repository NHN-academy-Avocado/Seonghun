public class Exercise6_11 {
    public static void main(String[] args) {
        int n = 17;
        
        System.out.println(isPrimte(n));
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

    public static boolean isPrimte(int n) {
        int[] arr = new int[n+1];
        prime(arr);
        if (arr[n] == 0) {
            return true;
        }
        return false;
    }
}
