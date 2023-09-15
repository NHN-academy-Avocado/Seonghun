package chapter5_7;

import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 날짜를 년, 월, 일 순서대로 입력하세요: ");
        String[] str = scanner.nextLine().split(" ");
        Date date = new Date(Integer.parseInt(str[0]), Byte.parseByte(str[1]), Byte.parseByte(str[2]));
        System.out.println(date.toString());
        System.out.print("두 번째 날짜를 년, 월, 일 순서대로 입력하세요: ");
        String[] str2 = scanner.nextLine().split(" ");
        Date date2 = new Date(Integer.parseInt(str2[0]), Byte.parseByte(str2[1]), Byte.parseByte(str2[2]));
        System.out.print("첫 번째 날짜랑 두 번째 날짜 같음? ");
        System.out.println(date.isEqual(date2));
        System.out.print("첫 번째 날짜보다 두 번재 날짜가 더 앞에 있음?(더 먼저임?)");
        System.out.println(date.isEarly(date2));
        System.out.print("첫 번째 날짜는 윤년임? ");
        System.out.println(date.isLeapYear());
        System.out.print("첫 번째 날짜의 다음날은 언제? ");
        System.out.println(date.nextDay());
        scanner.close();
    }
}
