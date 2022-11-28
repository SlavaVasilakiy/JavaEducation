//На вход подаётся два натуральных числа x и y. Выведите на печать прямоугольник из звёздочек размером x*y.
//
//Sample Input:
//
//4 2
//Sample Output:
//
//**
//**
//**
//**

import java.util.Scanner;
public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
