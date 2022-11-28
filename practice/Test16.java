//Даны числа x, y и n.
//
//Выведите
//�
//�
//�
//n
//
//x
//y
//
//​
//  . Выведите ответ с точностью 5 знаков после запятой. Гарантируется, что выражение имеет действительное значение. Результат выведите в виде числа типа double.
//
//Примечание. Если в ответе получается число с количеством знаков после запятой меньше, чем 5, выводить дополнительные нули не нужно!
//
//Sample Input:
//
//5 3 2
//Sample Output:
//
//11.18034

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double n = sc.nextDouble();
        double a = Math.pow(x, y); //возведение в степень
        double root = Math.pow(a,(1.0/n)); //извлекаем корень квадратный
        double dlina = Math.pow(10 , 5); //количество знаков после запятой
        System.out.println(Math.round(root * dlina)/dlina);
    }
}
