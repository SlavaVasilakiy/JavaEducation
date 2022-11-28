//На вход подаётся несколько целых чисел. Выведите эти числа, возведённые в степени от двух до пяти.
//
//Формат вывода: для каждого введённого числа степени выводятся в отдельной строке через пробел.
//
//Примечание. Каждая строка вывода оканчивается числом, а не пробелом.
//
//Sample Input:
//
//1 2 3
//Sample Output:
//
//1 1 1 1
//4 8 16 32
//9 27 81 243

import java.util.Scanner;
public class Test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 2;
        while (sc.hasNext() == true) {
            int n = sc.nextInt();
            for (int i = 2; i <= 5; i++){
                if (i == 2){
                    result = n * n;
                    System.out.print(result + " ");
                }else if (i == 3){
                    result = n * n * n;
                    System.out.print(result + " ");
                }else if (i == 4){
                    result = n * n * n * n;
                    System.out.print(result + " ");
                }else if (i == 5){
                    result = n * n * n * n * n;
                    System.out.print(result);
                }
            }
            System.out.println();
        }
    }
}
