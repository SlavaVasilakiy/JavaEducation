package lesson1;

import java.util.Scanner;

public class program_1_2 {

    public static void main(String[] args) {
        int a = inPut("a");
        int b = inPut("b");
        System.out.println(a);
        System.out.println(b);

    }

    static int inPut(String number) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Введите число" + " " + number + ": ");
        // boolean test1 = in.hasNextInt();
        int x = in.nextInt();
        return x;
    }

    static int k1(int a) {
        int c = 1;
        int c1 = a + c;

        return c1;
    }

    static int k2(int a) {
        int d = 2;
        int d2 = a * d;
        return d2;
    }

    static int find(int a, int b) {
        int sum = 0;
        int a1 = k1(a);
        int a2 = k2(a);
        while (a <= b) {
            sum = a1 + a2;
        }
        return sum;
    }
}
