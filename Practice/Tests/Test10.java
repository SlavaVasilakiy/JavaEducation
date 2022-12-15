package Tests;//На вход подаётся натуральное число n. Выведите на печать в одной строке через пробел все числа от 1 до n включительно, которые одновременно без остатка делятся на 2 и на 3. Если таких чисел в диапазоне нет, выведите "Таких чисел нет".
//
//Sample Input 1:
//
//1
//Sample Output 1:
//
//Таких чисел нет
//Sample Input 2:
//
//20
//Sample Output 2:
//
//6 12 18

import java.util.Scanner;
public class Test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n % 2 == 0) || (n % 3 == 0)) {
            for (int i = 1; i <= n; i++) {
                if ((i % 2 == 0) && (i % 3 == 0)) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.print("Таких чисел нет");
        }
    }
}
