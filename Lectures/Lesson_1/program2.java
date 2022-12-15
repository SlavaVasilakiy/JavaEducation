package Lesson_1;

/*
 * 1. Задана натуральная степень К. Сформировать случайным образом список коэффициэнтов (значения от 0 до 100) многочлен многочлен степени К.
 * Пример : К = 2 => 2 * x**2 + 4 * x + 5 = 0 или x**2 + 5 = 0 или 10 * x**2 = 0
 */
public class program2 {
    public static void main(String[] args) {
        int x = 5, y = 3;
        int z = ++x;
        y += x--;
        z += --x + y++;
        System.out.println(x + y + z);
    }
}
