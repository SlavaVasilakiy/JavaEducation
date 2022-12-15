package Tests;
// На вход подаётся три целых числа. Выведите среднее из них (т.е. не минимальное и не максимальное).


import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b) {
            if (a >= c) {
                if (c >= b) {
                    System.out.println(c);
                } else {
                    System.out.println(b);
                }
            } else {
                if (c >= b) {
                    System.out.println(a);
                } else {
                    System.out.println(b);
                }
            }
        } else {
            if (a >= c) {
                if (c >= b) {
                    System.out.println(b);
                } else {
                    System.out.println(a);
                }
            } else {
                if (c >= b) {
                    System.out.println(b);
                } else {
                    System.out.println(c);
                }
            }
        }
    }
}
