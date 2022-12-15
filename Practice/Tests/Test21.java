package Tests;

// Два индийских программиста, Махатма и Джавахарлал, вдруг обнаружили, что таблица умножения иногда весьма полезна для программистов, и решили её выучить. Помогите нашим индийским друзьям!
//
//На вход подаются числа n и m. Выведите таблицу умножения n * m (см. пример).
//
//Sample Input:
//
//3 4
//Sample Output:
//
//1 2 3 4
//2 4 6 8
//3 6 9 12

import java.util.Scanner;

public class Test21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = (i + 1) * (j + 1);
                System.out.print(j == m - 1 ? arr[i][j] : arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
