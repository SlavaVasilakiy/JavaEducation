package Tests;

//Дана последовательность целых чисел. Определите минимальную сумму пар элементов массива, расстояние (разница) между индексами которых равно 2. Если таких пар нет, выведите 0.
//
//Sample Input:
//
//8 7 6 5 4 3 2
//Sample Output:
//
//6

import java.util.Scanner;

public class Test20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String [] arr = s.split(" ");
        int[] numbers = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            numbers[i] = Integer.parseInt(arr[i]);
        }
        int min = 999999;
        for (int i = 0; i < numbers.length - 2; i++) {
            if ((numbers[i] + numbers[i + 2]) < min) {
                min = numbers[i] + numbers[i + 2];
            }
        }
        if (numbers.length < 3) {
            System.out.println("0");
        } else {
            System.out.println(min);
        }
    }
}
