package Tests;
// На вход подаётся последовательность целых чисел.
// Создайте из этой последовательности массив чисел, отсортированный по возрастанию, и выведите на печать.
//
//Sample Input:
//
//3 6 2 14 1
//Sample Output:
//
//[1, 2, 3, 6, 14]

import java.util.Arrays;
import java.util.Scanner;
public class Test19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" "); // считываем строку и разделяем на массив по пробелу
        int[] arrayNumbers = new int[str.length]; //создаем новый пустой массив такой же размерности что и считанный из консоли
        for (int i=0; i < arrayNumbers.length; i++){
            arrayNumbers[i]  = Integer.parseInt(str[i]); // в пустой массив записываем поэлементно значения из считанного из консоли
        }
        Arrays.sort(arrayNumbers); //сортируем полученный массив
        System.out.print(Arrays.toString(arrayNumbers)); //выводим на консоль ответ
    }
}

