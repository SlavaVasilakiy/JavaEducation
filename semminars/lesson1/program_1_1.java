/* На вход некоторому исполнителю
 подаётся два числа (a, b).
 У исполнителя есть две команды
 - команда 1 (к1): увеличить в с раз (xC), а умножается на c
 - команда 2 (к2): увеличить на d ( +d ), к a прибавляется d
 написать программу, которая выдаёт общее количество
 возможных преобразований a в b.
 a < b; a, b, c, d - натуральные
 Пример 1: а = 2, b = 7, c = 2, d = 1 ответ 3
 Подумать как можно показать хотя бы один маршрут преобразования
 ответ: (+1) (x2) (+1) или (х2) (+1) (+1) (+1)
 Пример 2: а = 11, b = 7, c = 2, d = 1
 ответ: нет решения. */

package lesson1;

public class program_1_1 {
    public static void main(String[] args) {
        int a = 22;
        int b = 2022;
        int k1 = 10;
        int k2 = 11;
        int count = 0;
        String s = "";

        if (a > b) {
            System.out.println("NO");
        } else {
            while (a <= b && a != 0) {
                a = a * k1;
                if (a <= b) {
                    s = s + "(x" + k1 + ") ";
                    count++;
                }
            }

            if (a > b) {
                a = a / k1;
            }

            while (a <= b) {
                a = a + k2;
                if (a <= b) {
                    s = s + "(+" + k2 + ") ";
                    count++;
                }
            }

            System.out.println(count);
            System.out.println(s);
            // =================================================================
            a = 22;
            s = "";
            count = 0;

            while (a <= b) {
                a = a + k2;
                if (a <= b) {
                    s = s + "(+" + k2 + ") ";
                    count++;
                }
            }

            while (a <= b && a != 0) {
                a = a * k1;
                if (a <= b) {
                    s = s + "(x" + k1 + ") ";
                    count++;
                }
            }

            if (a > b) {
                a = a / k1;
            }

            System.out.println(count);
            System.out.println(s);
        }

        // =====================================================================
        a = 22;
        s = "";
        count = 0;
        String result = "";
        while (b > a) {
            int x = b % k1;
            if (x == 0) {
                result = "(x" + k1 + ") " + result;
                b = b / k1;
                count++;
            } else {
                result = "(+" + k2 + ") " + result;
                b = b - k2;
                count++;
            }
        }
        System.out.println(count);
        System.out.println(result);
    }
}