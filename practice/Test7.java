//На вход подаётся натуральное число. Выведите на печать составляющие его цифры в обратном порядке.
//
//Sample Input:
//
//12345
//Sample Output:
//
//54321

import java.util.Scanner;
public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int x = word.length() - 1;
        while (x>=0) {
            System.out.print(word.charAt(x));
            x--;;
        }
    }
}
