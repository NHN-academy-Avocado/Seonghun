package chapter5_4;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] temp = scanner.nextLine().split(" ");
        Triangle triangle = new Triangle(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]), Integer.parseInt(temp[2]));
        System.out.print("긴 변: ");
        System.out.println(triangle.longestSide());
        System.out.print("짧은 변: ");
        System.out.println(triangle.shortestSide());
        System.out.print("중간 변: ");
        System.out.println(triangle.intermediateSide());
        System.out.print("삼각형 가능? ");
        System.out.println(triangle.isTriangle());
        System.out.print("둘레: ");
        System.out.println(triangle.roundTriangle());
        System.out.print("넓이: ");
        System.out.println(triangle.areaTriangle());
        System.out.print("무슨 삼각형? ");
        System.out.println(triangle.typeTriangle());
        scanner.close();
    }
}
