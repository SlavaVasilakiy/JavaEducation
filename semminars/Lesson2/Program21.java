// Задача 1: Задайте массив из 12 элементов,
// заполненный случайными числами из промежутка [-9, 9].
// Найдите сумму отрицательных и положительных
// элементов массива.

package Lesson2;

import java.util.concurrent.ThreadLocalRandom;

public class Program21 {
    public static void main(String[] args) {
        var array = randomNumbers(-9, 9, 12);
        System.out.println(printArray(array));
        System.out.printf(">0 %d\n", sumOfPosArray(array));
        System.out.printf("<0 %d\n",sumOfNegArray(array));
    }
    public static int[] randomNumbers(int minValue, int maxValue, int size) {
        var rand = ThreadLocalRandom.current();
        int[] massive = new int[size];
        for (int i = 0; i < size; i++) {
            massive[i] = rand.nextInt(minValue, maxValue + 1);
        }
        return massive;
    }
    public static int sumOfNegArray(int [] array) {
        int result = 0;
        for (int j : array) {
            if (j < 0) {
                result += j;
            }
        }
        return result;
    }
    public static int sumOfPosArray(int [] array) {
        int result = 0;
        for (int k : array) {
            if (k > 0) {
                result += k;
            }
        }
        return result;
    }
    public static String printArray (int [] massive) {
        String result = "[";
        int size = massive.length;
        int i = 0;
        while (i < size) {
            result += String.format("%4d", massive[i]);
            i++;
        }
        return result + "   ]";
    }
}
