package chapter5_4;

import java.util.Arrays;

public class Triangle {
    private int a;
    private int b;
    private int c;
    private int[] arr = new int[3];

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        Arrays.sort(arr);
    }

    public int shortestSide() {
        return arr[0];
    }

    public int longestSide() {
        return arr[2];
    }

    public int intermediateSide() {
        return arr[1];
    }

    public boolean isTriangle() {
        return longestSide() < shortestSide() + intermediateSide();
    }

    public int roundTriangle() {
        if (!isTriangle()) {
            return 0;
        }
        return this.a + this.b + this.c;
    }

    public double areaTriangle() {
        if (!isTriangle()) {
            return 0;
        }
        int s = this.a + this.b + this.c;
        return Math.sqrt(s * (s - this.a) * (s - this.b) *(s - this.c));
    }

    public String typeTriangle() {
        if (!isTriangle()) {
            return "삼각형이 아닙니다.";
        }
        if (this.a == this.b && this.a == this.c) {
            return "정삼각형";
        } else if (this.a == this.b || this.a == this.c || this.b == this.c) {
            return "이등변삼각형";
        } else {
            return "그냥 삼각형";
        }
    }
}
