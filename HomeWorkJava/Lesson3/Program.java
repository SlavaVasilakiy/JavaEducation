package Lesson3;

import java.util.Scanner;

/*
Обязательно

// На вход
// некоторому исполнителю
// подаётся четыре числа (a, b, c, d).

// У исполнителя есть две команды
// - команда 1 (к1): увеличить в с раз, а умножается на c
// - команда 2 (к2): увеличить на d , к a прибавляется d
// написать программу, которая выдаёт общее количество
// возможных преобразований a в b
// набор команд, позволяющий число a превратить в число b или сообщить, что это
// невозможно

// Пример 1: а = 1, b = 7, c = 2, d = 1
// ответ: к1, к1, к1, к1, к1, к1 или к1, к2, к1, к1, к1 или к1, к1, к2, к1.
// Пример 2: а = 11, b = 7, c = 2, d = 1
// ответ: нет решения.
// *Подумать над тем, как сделать вывод маршрута (хотя бы одного)

Тестовые данные

a: 2 b: 7 c: 2 d: 1 -> 3
a: 3 b: 27 c: 3 d: 2 -> 6
a: 30 b: 345 c: 5 d: 6 -> 0
a: 30 b: 345 c: 2 d: 1 -> 7047
a: 22 b: 333 c: 3 d: 1 -> 467
a: 55 b: 555 c: 5 d: 2 -> 30
a: 22 b: 2022 c: 11 d: 56 -> 0
a: 22 b: 2022 c: 11 d: 10 -> 18
a: 22 b: 2022 c: 3 d: 1 -> 763827
a: 22 b: 20220 c: 3 d: 1 -> 535173226980
a: 1 b: 1111 c: 2 d: 1 -> 3990330794
a: 1 b: 11111 c: 2 d: 1 -> 606408167570737286
ТУТ КОД НУЖЕН проверка оценивается только этой задачи
===============================================================
f(x) =
x-c, x%d == 1
x-c + x/d, x%d == 0
===============================================================
 */

public class Program {
    public static void main(String[] args) {
        getArg();
    }

    /**
     * Input method
     */
    public static int getNumber(String Number) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter int " + Number + ":");
        int n = sc.nextInt();
        return n;
    }

    /**
     * Input data
     */
    public static void getArg() {  // Turn each number to arguments to use in code
        int startNumber = getNumber("Start Number");
        int endNumber = getNumber("End Number");
        int multNumber = getNumber("Mult Number");
        int sumNumber = getNumber("Sum Number");
        System.out.println("Let's see your numbers:");
        System.out.printf("Start Number Number:%d, End Number:%d," +
                        " Mult Number:(%d), Sum Number:(%d)\n",
                startNumber, endNumber, multNumber
                , sumNumber);
        exception(startNumber, endNumber, multNumber, sumNumber);
    }

    /**
     * Calculating number of possible ways
     */
    public static long[] steps(int startNumber, int endNumber,
                               int multNumber, int sumNumber) {
        long[] arr = new long[endNumber + 1];
        arr[startNumber] = 1;
        for (int i = 0; i <= endNumber; i++) {
            if (i % multNumber == 0 && i / multNumber > 0) {
                arr[i] += arr[i / multNumber];
            }
            if (i > startNumber && i - sumNumber > 0) {
                arr[i] += arr[i - sumNumber];
            }
        }
        return arr;
    }

    /**
     * Check is input correct, then calculate and print number of possible ways
     */
    public static void exception(int startNumber, int endNumber, int multNumber, int sumNumber) {
        if (startNumber > endNumber) {
            System.out.println("Wrong number of arguments, a can not be greater than b, please enter correct numbers!");
        } else {
            long[] arr = steps(startNumber, endNumber, multNumber, sumNumber);
            long result = arr[endNumber];
            System.out.printf("Ways to turn %d to %d => %d", startNumber, endNumber, result);
            getMinPath(result, startNumber, endNumber, multNumber, sumNumber);
        }
    }

    /**
     * Minimum path to get endNumber
     */
    public static void getMinPath(long res, int startNumber, int endNumber, int multNumber, int sumNumber) {
        String minPath = "";
        System.out.print("\n Min path: ");
        if (res == 0) {
            System.out.println("There is no solution :(");
        } else {
            while (endNumber > startNumber) {
                if (endNumber % multNumber == 0) {
                    minPath += "(x" + multNumber + ")";
                    endNumber /= multNumber;
                } else {
                    minPath += "(+" + sumNumber + ")";
                    endNumber -= sumNumber;
                }
            }
            System.out.println(minPath);
        }
    }
}

