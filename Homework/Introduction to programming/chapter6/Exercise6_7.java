public class Exercise6_7 {
    public static void main(String[] args) {
        System.out.println(findLongestIndex("cheerccccwoeljcckljjc", 'c'));
        System.out.println(findLongestIndex("heerwoesdfljkljj", 'c'));
    }

    private static int findLongestIndex(String str, char c) {
        int answer = -1;
        int max = 0;
        int len = str.length();
        int i = 0;
        int count = 0;
        while (i < len) {
            if (str.charAt(i) == c) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                    answer = i-count;
                }
                count = 0;
            }
            i++;
        }
        return answer;
    }

}
