package practice;
//На вход подаётся натуральное число n. Создайте массив натуральных чисел от единицы до n включительно и выведите его на печать (в одной строке, через пробел).
//
//Sample Input:
//
//5
//Sample Output:
//
//1 2 3 4 5

import java.util.Scanner;
public class Test18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }
    }
}
